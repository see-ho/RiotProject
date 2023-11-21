package com.seeho.network

import com.seeho.network.model.ChampionResponse
import com.seeho.network.model.NetworkChampion
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface RpNetworkDataSource {
    suspend fun getChampions(): ChampionResponse<NetworkChampion>
}