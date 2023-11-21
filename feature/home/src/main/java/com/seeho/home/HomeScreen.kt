package com.seeho.home

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun HomeRoute(
    homeViewModel: HomeViewModel = hiltViewModel(),
){
    val homeUiState by homeViewModel.homeUiState.collectAsStateWithLifecycle()
    Log.e("TAG", "HomeRoute: ${homeUiState}", )
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = "Home")
    }
}