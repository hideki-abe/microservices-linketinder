package crud.vagas

import grails.rest.Resource

@Resource(uri='/zghero/vagas', formats=['json'])
class Vaga {

    static scaffold = Vaga

    String nome
    String descricao
    String lugar
    Long id_empresa

    static constraints = {

    }


}
