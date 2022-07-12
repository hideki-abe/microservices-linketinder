package com.zghero.controller

import com.zghero.model.CandidatoCompetencia
import com.zghero.repository.CandidatoCompetenciaRepository
import com.zghero.service.CandidatoCompetenciaService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import jakarta.inject.Inject

import javax.validation.Valid

@Controller("/zghero")
class CandidatoCompetenciaController {

    @Inject
    CandidatoCompetenciaRepository repository

    @Inject
    CandidatoCompetenciaService service

    @Post("/competencia-candidato")
    CandidatoCompetencia save(@Valid CandidatoCompetencia candidatoCompetencia){
        return repository.save(candidatoCompetencia)
    }

    @Get("/competencia-candidato")
    List<CandidatoCompetencia> getCandidatosCompetencias(){
        return repository.findAll()
    }

}
