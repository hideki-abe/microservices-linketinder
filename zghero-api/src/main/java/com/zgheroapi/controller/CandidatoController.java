package com.zgheroapi.controller;

import com.zgheroapi.model.entity.Candidato;
import com.zgheroapi.model.repository.Candidatos;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zghero/candidatos")
@Api("Api candidatos")
public class CandidatoController {

    private Candidatos repository;

    public CandidatoController(Candidatos repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Salva um candidato")
    public Candidato create(@RequestBody Candidato candidato){
        return repository.save(candidato);
    }

    @GetMapping
    @ApiOperation("Lista todos os candidatos")
    public List<Candidato> find(Candidato filtro){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING );

        Example example = Example.of(filtro, matcher);
        return repository.findAll(example);
    }

}
