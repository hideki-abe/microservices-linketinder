import com.zgheroapi.controller.CandidatoController
import com.zgheroapi.model.entity.Candidato
import com.zgheroapi.model.entity.Empresa
import com.zgheroapi.model.repository.Candidatos
import com.zgheroapi.model.repository.Empresas
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import spock.lang.Specification

@WebMvcTest
class EmpresaControllerSpec extends Specification{

    def "cria uma nova empresa"() {

        given: "instância de uma nova empresa"
        Empresa empresa = new Empresa()
        empresa.setNome("Empresa teste")

        when: "Stub do repositório"
        Empresas repository = Stub(Empresas.class)

        then: "cria uma nova empresa"
        repository.save(empresa)
    }

    def "lista todos as empresas"(){

        when: "Stub do repositório"
        Empresas repository = Stub(Empresas.class)

        then: "cria um novo candidato"
        List list = repository.findAll()
        list != null

    }
}
