package com.seeho.network.model

import com.seeho.model.data.Champion

data class NetworkChampion(
    val id: String,
    val key: String,
    val name: String,
    val title: String,
    val blurb: String,
){
    fun toChampion(): Champion {
        return Champion(
            id, key, name, title, blurb,
        )
    }
}
