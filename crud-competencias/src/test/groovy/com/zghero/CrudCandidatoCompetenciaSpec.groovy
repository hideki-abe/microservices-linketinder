package com.zghero

import com.zghero.model.CandidatoCompetencia
import com.zghero.model.Competencia
import io.micronaut.core.type.Argument
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import jakarta.inject.Inject
import spock.lang.Stepwise


@MicronautTest
@Stepwise
class CrudCandidatoCompetenciaSpec extends Specification{

    @Inject
    @Client('/zghero/competencia-candidato')
    HttpClient httpClient

    void "Test add"(){
        setup:
        CandidatoCompetencia candidatoCompetencia = new CandidatoCompetencia().tap {
            id_candidatos = 1
            id_competencias = 8
        }
        HttpRequest<CandidatoCompetencia> request = HttpRequest.POST("/", candidatoCompetencia)

        when:
        CandidatoCompetencia result = httpClient.toBlocking().retrieve(request, Argument.of(CandidatoCompetencia))

        then:
        result.id > 0
        result.id_competencias == 8
        result.id_candidatos == 1
    }


}
