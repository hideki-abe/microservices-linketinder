package com.zgheroapi.model.repository;

import com.zgheroapi.model.entity.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Candidatos extends JpaRepository<Candidato, Integer> {

    Candidato findByNome(String nome);

    @Override
    List<Candidato> findAll();
}
