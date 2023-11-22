package com.seeho.datastore

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringSetPreferencesKey
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Named

class BookmarksDataSourceImpl @Inject constructor(
    @Named("bookmark") private val dataStore: DataStore<Preferences>,
) : BookmarksDataSource {
    object PreferencesKey {
        val BOOKMARKED_SESSION = stringSetPreferencesKey("BOOKMARKED_SESSION")
    }

    override val bookmarkedChampions = dataStore.data.map {
        it[PreferencesKey.BOOKMARKED_SESSION] ?: emptySet()
    }

    override suspend fun updateBookmarkedChampion(bookmarkedChampion: Set<String>) {
        dataStore
            .edit {
                it[PreferencesKey.BOOKMARKED_SESSION] = bookmarkedChampion
            }
    }


}