# microservices-linketinder
Aplicação fullstack com estrutura de microserviços, separada em: API Spring, API Grails e API Micronaut.


## Documentação das APIS com Swagger

  ### Spring Framework: 
  
  server port=8082
  
  A API de cadastro de candidatos e empresas foi documentadas integrando o swagger ao próprio código com annotations. Para visualizar a documentação,
  inicie a aplicação e abra a documentação no seguinte endereço: http://localhost:8082/swagger-ui.html
  
  ### Grails Framework: 
  
  server port=8080
  
  A <a href="https://app.swaggerhub.com/apis-docs/HIDEKIABE/vagas/1.0.0#/">documentação</a> foi feita no Swagger Editor.

  ### Micronaut Framework: 
  
  server port=8081
  
  A <a href="https://app.swaggerhub.com/apis-docs/HIDEKIABE/competencias/1.0.0">documentação</a> foi feita no Swagger Editor.


## Configuração de Kafka

  ### Cheat Sheet:
      
  1. Inicialização do zookeeper: zookeeper-server-start.sh /home/hidekiabe/kafka/config/zookeeper.properties 
  2. Inicialização do kafka: kafka-server-start.sh /home/hidekiabe/kafka/config/server.properties
  3. Listar topicos do kafka: kafka-topics.sh --bootstrap-server localhost:9092 --list
  4. Criar um tópico: kafka-topics.sh --bootstrap-server localhost:9092 --create --topic teste
    4.1. Também é possível criar partições: kafka-topics.sh --bootstrap-server localhost:9092 --create --topic teste --partitions 16
  5. Inserir dados via linha de comando: kafka-console-producer.sh --broker-list localhost:9092 --topic teste
  6. Consumir dados via linha de comando: kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic teste
    6.1. Consumir desde o início: kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic teste --from-beginning
  7. Grupo de consumers: kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic teste --group grupo1
  8. Separando o tópico em partições: kafka-topics.sh --bootstrap-server localhost:9092 --alter --topic teste --partitions 10
  9. Informações do tópico: kafka-topics.sh --bootstrap-server localhost:9092 --describe --topic teste
  10. Deletando tópico: kafka-topics.sh --bootstrap-server localhost:9092 --delete --topic teste
  11. Mensagens com chave e valor: kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic teste --property "print.key=true" --property "key.separator=," --group  grupo1

  ### Inicialização do Kafka no projeto
  
  - Inicie os comandos 1 e 2 no terminal
  - Inicie todos os microserviços da aplicação, a view e também o de notificação de vaga que está <a href="https://github.com/hideki-abe/envio-de-email">nesse repositório</a>
  - Para testar a comunicação do kafka, insira uma nova vaga. 
  
  Obs.: O envio de email para os emails cadastrados não está completamente implementado por ocorrência de alguns bugs.

