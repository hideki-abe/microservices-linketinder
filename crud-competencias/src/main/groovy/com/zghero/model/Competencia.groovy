package com.zghero.model

import io.micronaut.core.annotation.Introspected
import javax.persistence.*

@Entity
@Introspected
@Table(name = 'competencias')
class Competencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    @Column(name = 'nome')
    String nome

}
