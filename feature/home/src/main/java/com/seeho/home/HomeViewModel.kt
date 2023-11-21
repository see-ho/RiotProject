package com.seeho.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.seeho.data.repository.ChampionRepository
import com.seeho.domain.GetChampionsUseCase
import com.seeho.model.data.Champion
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    getChampionsUseCase: GetChampionsUseCase,
): ViewModel() {
    private val _errorFlow = MutableSharedFlow<Throwable>()
    val errorFlow: SharedFlow<Throwable> get() = _errorFlow

    val homeUiState: StateFlow<HomeUiState> =
        flow {
            val champions = getChampionsUseCase()
            val uiState = HomeUiState.Success(champions)
            emit(uiState)
        }
            .catch { throwable -> _errorFlow.emit(throwable) }
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5_000),
                initialValue = HomeUiState.Loading,
            )
}