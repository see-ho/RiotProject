package com.seeho.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.seeho.domain.useCase.GetBookmarkedChampionIdsUseCase
import com.seeho.domain.useCase.GetChampionsUseCase
import com.seeho.model.data.SavableChampion
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    getChampionsUseCase: GetChampionsUseCase,
    private val getBookmarkedChampionIdsUseCase: GetBookmarkedChampionIdsUseCase
): ViewModel() {
    private val _errorFlow = MutableSharedFlow<Throwable>()
    val errorFlow: SharedFlow<Throwable> get() = _errorFlow

    private val _homeUiState = MutableStateFlow<HomeUiState>(HomeUiState.Loading)
    val homeUiState: StateFlow<HomeUiState> = _homeUiState.asStateFlow()

    fun toggleBookmarkButton(id:String, isBookmarked: Boolean){
        viewModelScope.launch {
            getBookmarkedChampionIdsUseCase.toggle(id,isBookmarked)
        }
    }

    init {
        viewModelScope.launch {
            val championsFlow = flow { emit(getChampionsUseCase()) }
            val bookmarkedIdsFlow = getBookmarkedChampionIdsUseCase()
            championsFlow.combine(bookmarkedIdsFlow) { champions, bookmarkedIds ->
                val enhancedChampions = champions.map { champion ->
                    val isBookmarked = bookmarkedIds.contains(champion.id)
                    SavableChampion(champion,isBookmarked)
                }
                HomeUiState.Success(
                    champions = enhancedChampions
                )
            }.catch { throwable ->
                _errorFlow.emit(throwable)
            }.collect { combinedUiState ->
                _homeUiState.value = combinedUiState
            }
        }
    }

    //
//    val homeUiState: StateFlow<HomeUiState> =
//        flow {
//            val champions = getChampionsUseCase()
//            val uiState = HomeUiState.Success(champions)
//            emit(uiState)
//        }
//            .catch { throwable -> _errorFlow.emit(throwable) }
//            .stateIn(
//                scope = viewModelScope,
//                started = SharingStarted.WhileSubscribed(5_000),
//                initialValue = HomeUiState.Loading,
//            )
}