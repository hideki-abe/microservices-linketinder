package com.zghero.repository

import com.zghero.model.CandidatoCompetencia
import io.micronaut.context.annotation.Executable
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository



@Repository
interface CandidatoCompetenciaRepository extends JpaRepository<CandidatoCompetencia, Long>{

    @Executable
    List<CandidatoCompetencia> findAll()

}