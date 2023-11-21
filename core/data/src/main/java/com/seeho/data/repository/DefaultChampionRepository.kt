package com.seeho.data.repository

import com.seeho.model.data.Champion
import com.seeho.network.RpNetworkDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject


class DefaultChampionRepository @Inject constructor(
    private val rpNetworkDataSource: RpNetworkDataSource
) : ChampionRepository {
    override suspend fun getChampions(): List<Champion> {
        return rpNetworkDataSource.getChampions().toList().map {
                it.toChampion()
        }
    }
}