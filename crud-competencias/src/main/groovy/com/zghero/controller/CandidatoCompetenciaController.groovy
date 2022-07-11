package com.zghero.controller

import com.zghero.model.CandidatoCompetencia
import com.zghero.repository.CandidatoCompetenciaRepository
import com.zghero.service.CandidatoCompetenciaService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import jakarta.inject.Inject

import javax.validation.Valid

@Controller("/zghero/competencia-candidato")
class CandidatoCompetenciaController {

    @Inject
    CandidatoCompetenciaRepository repository

    @Inject
    CandidatoCompetenciaService service

    @Post("/")
    CandidatoCompetencia save(@Valid CandidatoCompetencia candidatoCompetencia){
        return repository.save(candidatoCompetencia)
    }

    @Get("/")
    List<CandidatoCompetencia> getCandidatosCompetencias(){
        return repository.findAll()
    }

}
