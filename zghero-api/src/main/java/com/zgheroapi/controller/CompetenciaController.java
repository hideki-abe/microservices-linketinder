package com.zgheroapi.controller;

import com.zgheroapi.model.entity.Competencia;
import com.zgheroapi.model.repository.Competencias;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zghero/competencias")
public class CompetenciaController {

    private Competencias repository;

    public CompetenciaController(Competencias repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Competencia> find(Competencia filtro){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING );

        Example example = Example.of(filtro, matcher);
        return repository.findAll(example);
    }

}
