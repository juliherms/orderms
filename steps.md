# Instruções para Execução do Ambiente

Este documento descreve os passos para levantar os serviços com Docker Compose, executar a aplicação Spring Boot e publicar uma mensagem no RabbitMQ.

## 1. Iniciar os Serviços

```bash
docker-compose up
```

## 2. Acessar o RabbitMQ Management

- **URL:** [http://localhost:15672/](http://localhost:15672/)
- **Usuário:** `guest`
- **Senha:** `guest`

## 3. Executar a Aplicação Spring Boot

No diretório do projeto, execute:

```bash
mvn spring-boot:run
```

Ou, caso tenha gerado um JAR:

```bash
java -jar target/nome-da-aplicacao.jar
```

## 4. Publicar Mensagem no RabbitMQ

1. Acesse a console do RabbitMQ.
2. Navegue até **Queues and Streams**.
3. Selecione a fila desejada.
4. Clique em **Publish Message**.
5. No campo de payload, insira o JSON abaixo:

```json
{
    "codigoPedido": 1001,
    "codigoCliente": 1,
    "itens": [
        {
            "produto": "lápis",
            "quantidade": 100,
            "preco": 1.10
        },
        {
            "produto": "caderno",
            "quantidade": 10,
            "preco": 1.00
        }
    ]
}
```

