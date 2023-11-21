package com.seeho.network.model

import com.google.gson.annotations.SerializedName

data class ChampionResponse<T>(
    @SerializedName("data") val data: Map<String, T>
){
    fun toList(): List<T> = data.values.toList()
}