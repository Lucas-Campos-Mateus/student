<h1 align="center">
   Selection of material for students
</h1>


API pra gerenciar tarefas (CRUD) de cadastros de estudantes e quais matérias irão cursar.

## Tecnologias
- Spring Boot
- Spring MVC
- Spring Data Jpa
- MySQL
- Lombok

## Práticas adotadas
- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data Jpa
- Injeção de Dependências
- Tratamento de respostas de erro

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
Para executar a aplicação, siga as etapas abaixo:

1. Abra um terminal ou prompt de comando.

2. Navegue até o diretório onde o arquivo JAR está localizado. Use o comando `cd` para mudar de diretório.

3. Execute a aplicação usando o seguinte comando, substituindo `<caminho_para_seu_arquivo.jar>` pelo caminho real para o arquivo JAR:

```
### java -jar <caminho_para_seu_arquivo.jar>

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta Insomnia, a API poderá ser acessada em [localhost:8080](http://localhost:8080).
### Primeiro devemos adicionar as matérias que serão lecionadas.

- Adicionar Matéria
```
$ http POST :8080/subject

Script JSON:
{
  "name": "Sociologia"
}
```
- Listar Máteria(s)
```
$ http POST :8080/subject

[
	{
		"id": 7,
		"name": "Sociologia"
	}
]
```

### Depois podemos adicionar os estudantes para vincular com as matérias já existentes.
- Criar Estudante
```
$ http POST :8080/student

Script JSON:
{
    "firstName": "Lucas",
    "lastName": "Campos Mateus",
    "email": "camposmateus@outlook.com",
    "status": false,
    "subject": {
        "id": 8
    }
}
```

- Listar Estudante(s)
```
$ http GET :8080/student

[
	{
		"subject": {
			"id": 6,
			"name": "Biologia"
		},
		"firstName": "Emelly",
		"lastName": "Evellyn",
		"email": "Emilly@outlook.com",
		"status": true,
		"id": 13
	}
]	
```

- Atualizar Estudante
```
$ http PUT :8080/student
Script JSON:
{
    "firstName": "Emelly",
    "lastName": "Evellyn",
    "email": "Emilly@outlook.com",
    "status": true,
    "subject": {
        "id": 6
    }
}
```

- Remover Estudante
```
http DELETE :8080/student/(ID desejado) EX: 1

[ ]
```