package producers

import crud.vagas.Vaga
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer
import serializer.VagaSerializer;

class EmailProducer {

    Properties properties;

    EmailProducer(){
        properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, VagaSerializer.class.getName());
    }

    def sendEmail(Vaga vaga){
        KafkaProducer<String, Vaga> producer = new KafkaProducer<String, Vaga>(properties)
        ProducerRecord<String, Vaga> record = new ProducerRecord<String, Vaga>("email", vaga);
        producer.send(record);
        Thread.sleep(200);

        }
    }
