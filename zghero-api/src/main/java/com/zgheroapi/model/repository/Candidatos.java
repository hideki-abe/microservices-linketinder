package com.zgheroapi.model.repository;

import com.zgheroapi.model.entity.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Candidatos extends JpaRepository<Candidato, Integer> {

}
