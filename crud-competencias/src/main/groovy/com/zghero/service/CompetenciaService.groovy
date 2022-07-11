package com.zghero.service

import com.zghero.model.Competencia
import com.zghero.repository.CompetenciaRepository
import jakarta.inject.Inject
import jakarta.inject.Singleton

import javax.transaction.Transactional


@Singleton
@Transactional
class CompetenciaService {

    @Inject
    CompetenciaRepository competenciaRepository


}
