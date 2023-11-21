package com.seeho.data.repository

import com.seeho.model.data.Champion
import kotlinx.coroutines.flow.Flow

interface ChampionRepository {
    suspend fun getChampions(): List<Champion>
}