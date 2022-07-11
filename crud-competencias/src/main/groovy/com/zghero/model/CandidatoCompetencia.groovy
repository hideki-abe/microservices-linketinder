package com.zghero.model

import io.micronaut.core.annotation.Introspected
import javax.persistence.*


@Entity
@Introspected
@Table(name = 'candidatos_competencias')
class CandidatoCompetencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    @Column(name = "id_candidatos")
    Long id_candidatos

    @Column(name = "id_competencias")
    Long id_competencias

}
