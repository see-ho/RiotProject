package com.seeho.home

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.seeho.ui.ChampionsList

@Composable
fun HomeRoute(
    homeViewModel: HomeViewModel = hiltViewModel(),
){
    val homeUiState by homeViewModel.homeUiState.collectAsStateWithLifecycle()
    Log.e("TAG", "HomeRoute: ${homeUiState}", )
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ){ padding ->
        Column {
            Text(
                text = "Home",
            )
            Column (
                modifier = Modifier.padding(padding).fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ){
                when(homeUiState){
                    is HomeUiState.Loading -> {
                        CircularProgressIndicator(
                            Modifier.size(100.dp,100.dp),
                            color = Color.DarkGray,
                            strokeWidth = 5.dp
                        )
                    }
                    is HomeUiState.Success -> {
                        ChampionsList(
                            champions = (homeUiState as HomeUiState.Success).champions,
                            onToggleBookmark = homeViewModel::toggleBookmarkButton
                        )
                    }
                }
            }
        }
    }
}