# VOLL MÉDICA

## 📑ESCOPO
 API RESTFull backend responsável por gerenciar uma base de médicos (especialidades possíveis: ortopedia, cardiologia, ginecologia e dermatologia), pacientes e consultas para a VollMédica. Abaixo protótipo da aplicação frontend que consumirá o serviço. Reforço que esse projeto será exclusivo para o backend, ou seja, o protótipo será apenas um artefato de visualização de como a aplicação parecerá ao consumir o serviço.
 
![img.png](img.png)
 ## ✅ FUNCIONALIDADES
 
 - 📌 Cadastro, atualização e exclusão de médicos
 - 📌 Cadastro, atualização e exclusão de pacientes
 - 📌 Agendamento e cancelamento de consultas
 - 📌 Integração com banco de dados MySQL 

## 🛠️ TECNOLOGIAS UTILIZADAS

 - **Java 17**
 - **Spring Boot 3**
 - **JPA/Hibernate**
 - **MySQL**
 - **Insomnia**

## ⚙️ COMO EXECUTAR O PROJETO

   ```bash
 1. Clone este repositório:

    git clone https://github.com/seu-usuario/nome-do-repositorio.git
    cd nome-do-repositorio

 2. Configure o banco de dados no application.properties.

 3. Execute a aplicação:

      mvn spring-boot:run

 4. Acesse a API via http://localhost:8080. 
```

## 🌐 ROTAS

 #### ROTAS > ENTIDADE MÉDICO:
🌐 METODO POST - http://localhost:8080/medicos  
*Funcionalidade: Rota de cadastro de médicos.*

```
* Preparing request to http://localhost:8080/medicos
* Current time is 2025-03-05T23:12:12.803Z
* Enable automatic URL encoding
* Using default HTTP version
* Enable timeout of 30000ms
* Enable SSL validation
* Hostname localhost was found in DNS cache
*   Trying 127.0.0.1:8080...
* Connected to localhost (127.0.0.1) port 8080 (#29)

> POST /medicos HTTP/1.1
> Host: localhost:8080
> Content-Type: application/json
> User-Agent: insomnia/10.3.1
> Accept: */*
> Content-Length: 324

| {
| 	"nome": "Suzana Paris",
| 	"email": "suzana.paris@voll.med",
| 	"telefone": "11933254656",
| 	"crm": "654852",
| 	"especialidade": "DERMATOLOGIA",
| 	"endereco": {
| 			"logradouro": "rua 1",
| 			"bairro": "bairro",
| 			"cep": "12345678",
| 			"cidade": "Brasilia",
| 			"uf": "DF",
| 			"numero": "1",
| 			"complemento": "complemento"
| 			}
| }

* Mark bundle as not supporting multiuse

< HTTP/1.1 200 
< Content-Length: 0
< Date: Wed, 05 Mar 2025 23:12:12 GMT


* Connection #29 to host localhost left intact
```

 #### ROTAS > PACIENTE:
🌐 exemplo 1

 
 #### ROTAS > CONSULTA:
🌐 exemplo 1
