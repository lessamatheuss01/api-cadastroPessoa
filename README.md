# API de Pessoas e Endereços

Esta API foi desenvolvida com o objetivo de permitir a criação, edição e consulta de pessoas e seus endereços.

## Funcionalidades
A API desenvolvida permite as seguintes operações:

- Criar, editar e consultar uma ou mais pessoas;
- Criar, editar e consultar um ou mais endereços de uma pessoa;
- Indicar qual endereço será considerado o principal de uma pessoa.

## Endpoints

A API possui os seguintes endpoints:

- POST /api/pessoas: Cria uma nova pessoa.
- PUT /api/pessoas/{id}: Atualiza os dados de uma pessoa existente.
- GET /api/pessoas/{id}: Busca os detalhes de uma pessoa pelo ID.
- DELETE /api/pessoas/{id}: Exclui uma pessoa do sistema.

Você pode testar os endpoints usando uma ferramenta como o Postman ou URL por exemplo (localhost:8080/api/pessoas)

## Diagrama de classe

Segue o diagrama de classe da aplicação:

![diagrama de classe - cadastro de pessoas](https://github.com/lessamatheuss01/api-cadastroPessoa/assets/111442428/6392e996-dd63-4578-89ed-3381a2014c9b)

## Considerações Finais

Esse é um projeto básico de uma API de cadastro de pessoas, utilizando Java com Spring Boot.
