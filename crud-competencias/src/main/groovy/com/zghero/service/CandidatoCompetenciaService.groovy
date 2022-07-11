package com.zghero.service

import com.zghero.repository.CandidatoCompetenciaRepository
import jakarta.inject.Inject
import jakarta.inject.Singleton

import javax.transaction.Transactional


@Singleton
@Transactional
class CandidatoCompetenciaService {

    @Inject
    CandidatoCompetenciaRepository repository
}
