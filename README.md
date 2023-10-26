# Desafio Projeto - 3

Este é um projeto de exemplo para demonstrar como configurar, desenvolver e implantar um sistema de cadastro de produtos usando Spring Boot, MongoDB e RabbitMQ.

## Configurações

### MongoDB
Para configurar o MongoDB, você pode definir as informações de conexão no arquivo `application.properties`:

```properties
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=nome-do-banco
```
### RabbitMQ
Para configurar o RabbitMQ, você pode definir as informações de conexão no arquivo `application.properties`:

```properties
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
spring.rabbitmq.username=usuario
spring.rabbitmq.password=senha
```

### Modelos de Dados
O sistema inclui modelos de dados para representar os produtos, com campos comuns e características específicas para alguns tipos de produtos, 
<br>ex: Água e Refrigerante.

#### Campos Comuns
id: Identificador único do produto
nome: Marca do produto
descricao: Descrição do produto
preco: Preço do produto


### Endpoints

O sistema possui um endpoint que permite salvar um produto no banco de dados e enviar os dados do produto para uma fila do RabbitMQ.

Endpoint: POST /api/produtos
Corpo da Requisição (Exemplo JSON):
```
{
"descricao": "Refrigerante Black",
"preco": 3.99,
"comAçucar": false
}
```

### Docker Compose
Um arquivo docker-compose.yml está disponível para criar uma infraestrutura de desenvolvimento que inclui a aplicação, o MongoDB e o RabbitMQ. Você pode usar o comando docker-compose up para iniciar os contêineres.