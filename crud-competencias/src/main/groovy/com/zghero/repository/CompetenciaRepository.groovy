package com.zghero.repository

import com.zghero.model.Competencia
import io.micronaut.context.annotation.Executable
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository


@Repository
interface CompetenciaRepository extends JpaRepository<Competencia, Long>{

    @Executable
    List<Competencia> findAll()


}
