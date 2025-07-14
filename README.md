# 💰 GranaGuru

**GranaGuru** é uma aplicação Web de controle financeiro pessoal que ajuda o usuário a registrar sua receita mensal, controlar gastos fixos e pontuais, planejar investimentos e acompanhar metas financeiras.

## 📌 Funcionalidades Principais

- ✅ Cadastro de receitas mensais
- ✅ Registro de gastos fixos
- ✅ Inclusão de gastos pontuais
- ✅ Reserva para investimentos

### 🔜 Funcionalidades Futuras

- 📈 Cadastro de investimentos realizados
- 💸 Previsão de dividendos mensais
- 🎯 Criação de metas financeiras com previsão de alcance

---

## 🛠️ Tecnologias Utilizadas

| Camada         | Tecnologia              |
|----------------|--------------------------|
| Frontend       | Angular.js               |
| Backend        | Java (Spring Boot)       |
| Banco de Dados | PostgreSQL               |
| Autenticação   | Firebase Auth            |

---

## 🗂️ Estrutura do Projeto

grana-guru-backend/
├── controller/ # Controllers REST
├── model/ # Entidades JPA
├── repository/ # Repositórios Spring Data
├── service/ # Lógica de negócios
├── GranaGuruApplication.java
└── resources/
└── application.properties

---

## 🚀 Como Executar Localmente

### Pré-requisitos

- Java 17+
- PostgreSQL
- Node.js + Angular CLI
- Firebase projeto com Auth ativado

### Banco de dados PostgreSQL

Crie um banco de dados chamado `granaguru`:

```sql
CREATE DATABASE granaguru;
