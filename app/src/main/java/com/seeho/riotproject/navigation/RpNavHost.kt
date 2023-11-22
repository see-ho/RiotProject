package com.seeho.riotproject.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.seeho.bookmarks.navigaion.bookmarksScreen
import com.seeho.home.home.homeRoute
import com.seeho.home.home.homeScreen
import com.seeho.riotproject.ui.RpAppState

@Composable
fun RpNavHost(
    appState: RpAppState,
    modifier: Modifier = Modifier,
    startDestination: String = homeRoute,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        homeScreen()
        bookmarksScreen()
    }
}
