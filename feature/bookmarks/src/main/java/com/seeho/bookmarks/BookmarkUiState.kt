package com.seeho.bookmarks

import com.seeho.model.data.SavableChampion

sealed interface BookmarkUiState{
     data object Loading : BookmarkUiState
     //data object Error : HomeUiState

    data class Success(
        //val champions: List<Champion>
        val champions: List<SavableChampion>
    ) : BookmarkUiState
}