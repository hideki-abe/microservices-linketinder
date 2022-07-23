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


## Kafka

  ### Cheat Sheet:
      
  1. Inicialização do zookeeper:  zookeeper-server-start.sh /home/hidekiabe/kafka/config/zookeeper.properties 
  2. Inicialização do kafka:  kafka-server-start.sh /home/hidekiabe/kafka/config/server.properties
  3. Listar topicos do kafka:   kafka-topics.sh --bootstrap-server localhost:9092 --list
  4. Criar um tópico:   kafka-topics.sh --bootstrap-server localhost:9092 --create --topic teste</br>
    4.1. Também é possível criar partições:   kafka-topics.sh --bootstrap-server localhost:9092 --create --topic teste --partitions 16
  5. Inserir dados via linha de comando:  kafka-console-producer.sh --broker-list localhost:9092 --topic teste
  6. Consumir dados via linha de comando:  kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic teste</br>
    6.1. Consumir desde o início:   kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic teste --from-beginning
  7. Grupo de consumers:   kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic teste --group grupo1
  8. Separando o tópico em partições:   kafka-topics.sh --bootstrap-server localhost:9092 --alter --topic teste --partitions 10
  9. Informações do tópico:   kafka-topics.sh --bootstrap-server localhost:9092 --describe --topic teste
  10. Deletando tópico:   kafka-topics.sh --bootstrap-server localhost:9092 --delete --topic teste
  11. Mensagens com chave e valor:  kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic teste --property "print.key=true" --property "key.separator=," --group  grupo1

  ### Inicialização do Kafka no projeto
  
  - Inicie os comandos 1 e 2 no terminal
  - Inicie todos os microserviços da aplicação, a view e também o de notificação de vaga que está <a href="https://github.com/hideki-abe/envio-de-email">nesse repositório</a>
  - Para testar a comunicação do kafka, insira uma nova vaga. 
  
  Obs.: O envio de email para os emails cadastrados não está completamente implementado por ocorrência de alguns bugs.
  
## Docker

  ### Cheat Sheet: 
   
  1. comando run(cria um novo container): docker container run <nome do container>
  2. rodar em outro bash: docker container run debian bash --version
  3. mostrar os processos: docker container ps -a 
  4. entrar em um novo container: docker container run -it debian bash</br>
    4.1. criar arquivo no novo container: touch curso-docker.txt</br>
    4.2. sair do container: exit
  5. lista os containers: docker container ls -a
  6. nomear container: docker container run --name mydeb -it debian bash
  7. acessar container específico: docker container start -ai infallible_haslett 
  8. startar o container em uma porta específica: docker container run -p 8080:80 nginx
  9. mapear diretórios para container: docker container run -p 8080:80 -v $(pwd)/not-found:/usr/share/nginx/html nginx
    9.1.  docker container run -p 8080:80 -v $(pwd)/html:/usr/share/nginx/html nginx
  10. rodar servidor web em background: docker container run -d --name ex-daemon-basic -p 8080:80 -v $(pwd)/html:/usr/share/nginx/html nginx
  11. parar um container: docker container stop ex-daemon-basic 
  12. reinicializar um container: docker container restart <nome do container>
  13. listar imagens: docker image ls
  14. listar volumes: docker volume ls
  15. remover imagem: docker image rm <código da imagem>
  


    
    
    
    
    
    
    
    
    
    
  

