package crud.vagas

import grails.rest.Resource
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.common.serialization.StringSerializer
import producers.EmailProducer
import serializer.VagaSerializer

@Resource(uri='/zghero/vagas', formats=['json'])
class Vaga {

    static scaffold = Vaga

    String nome
    String descricao
    String lugar
    Long id_empresa

    Vaga() {
        sendEmail()
    }

    def sendEmail(){
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties)
        ProducerRecord<String, String> record = new ProducerRecord<String, String>("email", "[Nova vaga]");
        producer.send(record);
    }

    static constraints = {

    }


}
