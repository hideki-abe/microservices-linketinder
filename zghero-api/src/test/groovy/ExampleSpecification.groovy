import com.zgheroapi.controller.CandidatoController
import com.zgheroapi.model.entity.Candidato
import spock.lang.Specification

class ExampleSpecification extends Specification{

    def "cria um novo candidato"() {

        given:
        Candidato candidato = Mock()
        CandidatoController controller = Mock()
        candidato.setCpf("12345678")

        when:
        controller.create(candidato)

        then:
        assert controller.create(candidato)


    }

}
