package crud.vagas

import javax.transaction.Transactional

class VagaController {

    static namespace = 'scaffolding'

    static allowedMethods = [save: 'POST', update: 'PUT', delete: 'DELETE']

    @Transactional
    def create(Vaga vaga){
        println "teste"
        vaga.save()
    }

}
