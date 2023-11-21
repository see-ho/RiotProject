package com.seeho.data.di

import com.seeho.data.repository.ChampionRepository
import com.seeho.data.repository.DefaultChampionRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {
    @Binds
    fun bindChampionRepository(
        championRepository: DefaultChampionRepository
    ):ChampionRepository
}