package com.zghero.controller

import com.zghero.model.Competencia
import com.zghero.repository.CompetenciaRepository
import com.zghero.service.CompetenciaService
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put
import jakarta.inject.Inject

import javax.validation.Valid

@Controller("zghero/competencias")
class CompetenciaController {

    @Inject
    CompetenciaService competenciaService

    @Inject
    CompetenciaRepository competenciaRepository

    @Post("/")
    Competencia save(@Valid Competencia competencia){
        return competenciaRepository.save(competencia)
    }

    @Put("/{id}")
    Competencia update(@PathVariable Long id, @Valid @Body Competencia competencia){
        competencia.id = id
        return competenciaRepository.save(competencia)
    }

    @Get("/")
    List<Competencia> getCompetencias(){
        return competenciaRepository.findAll()
    }

}
