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
* Current time is 2025-03-12T20:26:10.865Z
* Enable automatic URL encoding
* Using default HTTP version
* Enable timeout of 30000ms
* Enable SSL validation
* Found bundle for host: 0x23faffc1180 [serially]
* Can not multiplex, even if we wanted to
* Re-using existing connection #54 with host localhost
* Connected to localhost (127.0.0.1) port 8080 (#54)

> POST /medicos HTTP/1.1
> Host: localhost:8080
> Content-Type: application/json
> User-Agent: insomnia/10.3.1
> Accept: */*
> Content-Length: 323

| {
| 	"nome": "Maria Amaral",
| 	"email": "maria.amaral@voll.med",
| 	"telefone": "1156658558",
| 	"crm": "953157",
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

< HTTP/1.1 201 
< Location: http://localhost:8080/medicos/6
< Content-Type: application/json
< Transfer-Encoding: chunked
< Date: Wed, 12 Mar 2025 20:26:10 GMT


* Received 152 B chunk
* Received 5 B chunk
* Connection #54 to host localhost left intact
```
🌐 METODO GET - http://localhost:8080/medicos  
*Funcionalidade: Rota para consulta de médicos com paginação.*  
*Parâmetro sort --> Classifica a consulta com base no campo informado.*  
*Parâmetro size --> Determina a quantidade de registros retornados por página.*  
*Parâmetro page --> Determina a página que deseja ser consultada.*

```
* Preparing request to http://localhost:8080/medicos?sort=nome&size=10%3Fpage%3D0
* Current time is 2025-03-06T13:01:03.616Z
* Enable automatic URL encoding
* Using default HTTP version
* Enable timeout of 30000ms
* Enable SSL validation
* Found bundle for host: 0x240105b0da0 [serially]
* Can not multiplex, even if we wanted to
* Re-using existing connection #38 with host localhost
* Connected to localhost (127.0.0.1) port 8080 (#38)

> GET /medicos?sort=nome&size=10%3Fpage%3D0 HTTP/1.1
> Host: localhost:8080
> User-Agent: insomnia/10.3.1
> Accept: */*

* Mark bundle as not supporting multiuse

< HTTP/1.1 200 
< Content-Type: application/json
< Transfer-Encoding: chunked
< Date: Thu, 06 Mar 2025 13:01:03 GMT


* Received 631 B chunk
* Received 5 B chunk
* Connection #38 to host localhost left intact

{
	"content": [
		{
			"nome": "João Carlos",
			"email": "joao.carlos@voll.med",
			"crm": "123888",
			"especialidade": "ORTOPEDIA"
		},
		{
			"nome": "Rodrigo Ferreira",
			"email": "rodrigo.ferreira@voll.med",
			"crm": "123456",
			"especialidade": "ORTOPEDIA"
		},
		{
			"nome": "Suzana Paris",
			"email": "suzana.paris@voll.med",
			"crm": "654852",
			"especialidade": "DERMATOLOGIA"
		}
	],
	"pageable": {
		"pageNumber": 0,
		"pageSize": 20,
		"sort": {
			"empty": false,
			"unsorted": false,
			"sorted": true
		},
		"offset": 0,
		"unpaged": false,
		"paged": true
	},
	"last": true,
	"totalPages": 1,
	"totalElements": 3,
	"size": 20,
	"number": 0,
	"sort": {
		"empty": false,
		"unsorted": false,
		"sorted": true
	},
	"first": true,
	"numberOfElements": 3,
	"empty": false
}

```
🌐 METODO PUT - http://localhost:8080/medicos  
*Funcionalidade: Rota para atualização de médicos para os campos de nome, telefone, endereço.*  

```
* Preparing request to http://localhost:8080/medicos
* Current time is 2025-03-06T13:33:36.092Z
* Enable automatic URL encoding
* Using default HTTP version
* Enable timeout of 30000ms
* Enable SSL validation
* Found bundle for host: 0x240105b11a0 [serially]
* Can not multiplex, even if we wanted to
* Re-using existing connection #43 with host localhost
* Connected to localhost (127.0.0.1) port 8080 (#43)

> PUT /medicos HTTP/1.1
> Host: localhost:8080
> Content-Type: application/json
> User-Agent: insomnia/10.3.1
> Accept: */*
> Content-Length: 57

| {
| 	"id": 2,
| 	"nome": "João Carlos Noronha Albuquerque"
| }

* Mark bundle as not supporting multiuse

< HTTP/1.1 200 
< Content-Length: 0
< Date: Thu, 06 Mar 2025 13:33:36 GMT


* Connection #43 to host localhost left intact
```
🌐 METODO DELETE - http://localhost:8080/medicos/3  
*Funcionalidade: Rota para exclusão de médicos com base no id.*

```
* Preparing request to http://localhost:8080/medicos/3
* Current time is 2025-03-10T19:02:28.055Z
* Enable automatic URL encoding
* Using default HTTP version
* Enable timeout of 30000ms
* Enable SSL validation
* Found bundle for host: 0x240105af4e0 [serially]
* Can not multiplex, even if we wanted to
* Re-using existing connection #46 with host localhost
* Connected to localhost (127.0.0.1) port 8080 (#46)

> DELETE /medicos/3 HTTP/1.1
> Host: localhost:8080
> User-Agent: insomnia/10.3.1
> Accept: */*

* Mark bundle as not supporting multiuse

< HTTP/1.1 200 
< Content-Length: 0
< Date: Mon, 10 Mar 2025 19:02:28 GMT


* Connection #46 to host localhost left intact
```

