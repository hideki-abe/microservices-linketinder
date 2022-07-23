package serializer

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import crud.vagas.Vaga
import org.apache.kafka.common.serialization.Serializer

class VagaSerializer implements Serializer<Vaga> {

    @Override
    public byte[] serialize(String topic, Vaga vaga) {
        try {
            return new ObjectMapper().writeValueAsBytes(vaga);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
