package com.seeho.home

import com.seeho.model.data.SavableChampion

sealed interface HomeUiState{
     data object Loading : HomeUiState
     //data object Error : HomeUiState

    data class Success(
        //val champions: List<Champion>
        val champions: List<SavableChampion>
    ) : HomeUiState
}