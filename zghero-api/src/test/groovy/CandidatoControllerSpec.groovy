import com.zgheroapi.controller.CandidatoController
import com.zgheroapi.model.entity.Candidato
import com.zgheroapi.model.repository.Candidatos
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import spock.lang.Specification

@WebMvcTest
class CandidatoControllerSpec extends Specification{

    def "cria um novo candidato"() {

        given: "instância de um novo candidato"
        Candidato candidato = new Candidato()
        candidato.setNome("Lucas")

        when: "Stub do repositório"
        Candidatos repository = Stub(Candidatos.class)

        then: "cria um novo candidato"
        repository.save(candidato)
    }

    def "lista todos os candidatos"(){

        when: "Stub do repositório"
        Candidatos repository = Stub(Candidatos.class)

        then: "cria um novo candidato"
        List list = repository.findAll()
        list != null

    }


}
