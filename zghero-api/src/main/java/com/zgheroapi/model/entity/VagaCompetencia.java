package com.zgheroapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "vagas_competencias")
public class VagaCompetencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    /*
    @ManyToOne
    @JoinColumn(name = "id_vagas")
    private Vaga id_vagas;

    @ManyToOne
    @JoinColumn(name = "id_competencias")
    private Competencia id_competencias;


     */
    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    public Integer getId() {
        return id;
    }
}
