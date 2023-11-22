package com.seeho.datastore

import kotlinx.coroutines.flow.Flow

interface BookmarksDataSource {
    val bookmarkedChampions: Flow<Set<String>>
    suspend fun updateBookmarkedChampion(bookmarkedChampion: Set<String>)
}