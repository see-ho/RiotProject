package com.seeho.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.seeho.model.data.SavableChampion

@Composable
fun ChampionsList(
    champions: List<SavableChampion>,
    onToggleBookmark : (String,Boolean) -> Unit
){
    LazyColumn{
        items(champions){
            ChampionCard(
                it.champion,
                isBookmarked = it.isBookmarked,
                onToggleBookmark = {
                    onToggleBookmark(it.champion.id,!it.isBookmarked)
                }
            )
        }
    }
}