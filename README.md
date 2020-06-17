# springboot-container
Projeto para aprender a usar Docker com springboot e comunicação entre containers

Entre na pasta `db` do projeto e rode comando a baixo para subir o banco de dados: 

`docker-compose up`

Acesse o banco com usuario `root` e senha `123` e crie a database `springbootdb` com o seguinte comando:

`create database springbootdb;`

Volte para a pasta raiz do projeto e rode os comandos:

Para fazer o build do projeto:
`mvn clean install`

Para fazer o build do container docker:
`docker-compose build`

Para subir o container:
`docker-compose up -d` ou `docker-compose up` para visualizar os logs de inicialização.

Para parar o container use o comando:

`docker-compose down`

A aplicação irá rodar na URL `localhost:8081`
