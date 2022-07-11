package com.zgheroapi.controller;

import com.zgheroapi.model.entity.Empresa;
import com.zgheroapi.model.repository.Empresas;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zghero/empresas")
public class EmpresaController {

    private Empresas repository;

    public EmpresaController(Empresas repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Salva uma nova empresa")
    public Empresa create(@RequestBody Empresa empresa){
        return repository.save(empresa);
    }

    @GetMapping
    @ApiOperation("Lista todas as empresas")
    public List<Empresa > find(Empresa filtro){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING );

        Example example = Example.of(filtro, matcher);
        return repository.findAll(example);
    }



}
