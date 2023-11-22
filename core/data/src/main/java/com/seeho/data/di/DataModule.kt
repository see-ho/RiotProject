package com.seeho.data.di

import com.seeho.data.repository.BookmarksRepository
import com.seeho.data.repository.BookmarksRepositoryImpl
import com.seeho.data.repository.ChampionRepository
import com.seeho.data.repository.DefaultChampionRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {
    @Binds
    fun bindChampionRepository(
        championRepository: DefaultChampionRepository
    ):ChampionRepository

    @Binds
    fun bindBookmarksRepository(
        championRepository: BookmarksRepositoryImpl
    ):BookmarksRepository

//    @Binds
//    fun provideBookmarksRepository(
//        localDataStore: BookmarkDataSource
//    ): BookmarksRepository {
//        return BookmarksRepositoryImpl(localDataStore)
//    }
}