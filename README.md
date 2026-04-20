# 💰 API de Cobranças

Uma API RESTful desenvolvida em **Java** com **Spring Boot** para o gerenciamento de clientes e cobranças. Este projeto implementa um CRUD completo com persistência de dados, validações de entrada e tratamento global de exceções.

## 🚀 Tecnologias Utilizadas

Este projeto foi construído com as seguintes tecnologias:

* **Java 17** 
* **Spring Boot 3**
* **Spring Data JPA / Hibernate**
* **PostgreSQL** (Banco de Dados)
* **Bean Validation** (Validação de DTOs)
* **Docker** (Containerização)
* **Render** (Hospedagem em Nuvem)

## ☁️ Deploy (Aplicação no Ar)

A API está hospedada na nuvem e pode ser testada em tempo real!
🔗 **URL Base:** `https://api-cobrancas.onrender.com`

*(Nota: Como a hospedagem utiliza o plano gratuito, a primeira requisição pode levar cerca de 50 segundos para responder caso o servidor esteja adormecido).*

## ⚙️ Funcionalidades e Endpoints

Abaixo estão as rotas disponíveis para o gerenciamento de Clientes:

* `POST /clientes` - Cadastra um novo cliente (Requer DTO com validação de Nome, Email e CPF).
* `GET /clientes` - Lista todos os clientes cadastrados.
* `GET /clientes/{id}` - Busca um cliente específico pelo ID.
* `PUT /clientes/{id}` - Atualiza os dados de um cliente existente.
* `DELETE /clientes/{id}` - Remove um cliente do banco de dados.

## 🛡️ Tratamento de Erros

A API conta com um `RestControllerAdvice` para tratamento global de exceções. Caso uma validação falhe (ex: CPF inválido ou campo em branco), a API retorna um `400 Bad Request` com um JSON limpo e amigável informando exatamente qual campo falhou.

## 🛠️ Como rodar o projeto localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/Kyuubi900/api-cobrancas.git