package com.seeho.datastore.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import com.seeho.datastore.BookmarksDataSource
import com.seeho.datastore.BookmarksDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    private const val BOOKMARK_DATASTORE_NAME = "BOOKMARK_PREFERENCES"
    private val Context.sessionDataStore by preferencesDataStore(BOOKMARK_DATASTORE_NAME)
    @Provides
    @Singleton
    @Named("bookmark")
    fun provideBookmarkDataStore(
        @ApplicationContext context: Context
    ): DataStore<Preferences> = context.sessionDataStore

    @Provides
    @Singleton
    fun provideBookmarkDataSource(
        @Named("bookmark")
        dataStore: DataStore<Preferences>
    ): BookmarksDataSource {
        return BookmarksDataSourceImpl(dataStore)
    }


}
