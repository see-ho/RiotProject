package com.seeho.network.retrofit

import com.seeho.network.RpNetworkDataSource
import com.seeho.network.model.ChampionResponse
import com.seeho.network.model.NetworkChampion
import dagger.Provides
import kotlinx.coroutines.flow.Flow
import retrofit2.Retrofit
import retrofit2.http.GET
import javax.inject.Inject
import javax.inject.Singleton

private interface RpNetworkApi{
    @GET("data/ko_KR/champion.json")
    suspend fun getChampions(): ChampionResponse<NetworkChampion>
}


@Singleton
class RetrofitRpNetwork @Inject constructor(
    private val retrofit: Retrofit
): RpNetworkDataSource {
    override suspend fun getChampions(): ChampionResponse<NetworkChampion> {
        return retrofit.create(RpNetworkApi::class.java).getChampions()
    }
}