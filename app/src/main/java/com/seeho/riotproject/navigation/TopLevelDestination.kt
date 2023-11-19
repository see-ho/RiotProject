package com.seeho.riotproject.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import com.seeho.designsystem.icon.RpIcons
import com.seeho.riotproject.R
import com.seeho.bookmark.R as bookmarkR
import com.seeho.home.R as homeR

enum class TopLevelDestination (
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int,
    val titleTextId: Int,
){
    HOME(
        selectedIcon = RpIcons.Home,
        unselectedIcon = RpIcons.HomeBorder,
        iconTextId = homeR.string.home,
        titleTextId = R.string.app_name,
    ),
    BOOKMARKS(
        selectedIcon = RpIcons.Bookmarks,
        unselectedIcon = RpIcons.BookmarksBorder,
        iconTextId = bookmarkR.string.saved,
        titleTextId = bookmarkR.string.saved,
    ),

}