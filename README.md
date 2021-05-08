# DS Vendas 
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/santosediego/dsvendas-sds3/blob/main/LICENSE) 
[![Netlify Status](https://api.netlify.com/api/v1/badges/dba50e96-5a47-4ee6-8369-5d4a763ce0ed/deploy-status)](https://app.netlify.com/sites/dsvendasdiegosantos/deploys)

# Sobre o projeto

https://dsvendasdiegosantos.netlify.app/

DS Vendas é uma aplicação full stack web desenvolvida durante a 3ª edição da **Semana DevSuperior** (#sds3), evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior"). A aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.

## Layout web
![Web 1](https://raw.githubusercontent.com/santosediego/assets/main/dsvendas-sds3/dsvendas_home.png "Página Home")

![Web 2](https://raw.githubusercontent.com/santosediego/assets/main/dsvendas-sds3/dsvendas_dashboard.png "Dashboard de vendas")

## Modelo conceitual
![Image](https://raw.githubusercontent.com/santosediego/assets/main/dsvendas-sds3/sds3-mc.png "Modelo conceitual")

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Front end
- HTML / CSS / Bootstrap / JS / TypeScript
- ReactJS
- Apex Charts
- React Router Dom
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/santosediego/dsvendas-sds3.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/santosediego/dsvendas-sds3.git

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn install

# executar o projeto
yarn start
```

# Autor

[Diego Santos](https://github.com/santosediego "Perfil Github Diego Santos")
