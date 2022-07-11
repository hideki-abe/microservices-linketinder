package com.zghero

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
class CrudCompetenciasSpec extends Specification {

    @Inject
    @Client('/zghero/competencias')
    HttpClient httpClient

    void 'test list'() {
        setup:
        HttpRequest<Competencia> request = HttpRequest.GET("/")

        when:
        HttpResponse response = httpClient.toBlocking().exchange(request)

        then:
        response.code() == HttpStatus.OK.code
        List<Competencia> result = httpClient.toBlocking().retrieve(request, Argument.listOf(Competencia))

        result.size() > 0


    }

}
