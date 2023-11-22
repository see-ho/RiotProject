package com.seeho.domain.useCase

import com.seeho.data.repository.ChampionRepository
import com.seeho.model.data.Champion
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetChampionsUseCase @Inject constructor(
    private val championRepository: ChampionRepository
){
    suspend operator fun invoke(): List<Champion> = championRepository.getChampions()
}