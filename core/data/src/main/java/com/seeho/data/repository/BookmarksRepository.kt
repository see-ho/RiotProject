package com.seeho.data.repository

import kotlinx.coroutines.flow.Flow

interface BookmarksRepository {
    suspend fun getBookmarkedChampionIds(): Flow<Set<String>>
    suspend fun bookmarkChampion(sessionId: String, bookmark: Boolean)
}