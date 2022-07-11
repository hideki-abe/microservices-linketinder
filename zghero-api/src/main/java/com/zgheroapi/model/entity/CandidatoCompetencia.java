package com.zgheroapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "candidatos_competencias")
public class CandidatoCompetencia {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /*
    @ManyToOne
    @JoinColumn(name = "id_candidatos")
    private Candidato id_candidatos;

    @ManyToOne
    @JoinColumn(name = "id_competencias")
    private Competencia id_competencias;

    public void setId(Integer id) {
        this.id = id;
    }


     */
    @Id
    public Integer getId() {
        return id;
    }
}
