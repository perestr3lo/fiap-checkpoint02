## 🚀 README.md

Este repositório contém a aplicação Fiap Checkpoint 01.

### Pré-requisitos
* Java 17+
* Docker
* Acesso à internet
* Acesso ao Docker Hub


### Instruções de Uso

Antes de executar a aplicação, é necessário obter a imagem do Docker Hub. Para isso, utilize o seguinte comando:

```bash
docker pull pallestrelli/fiap-checkpoint2
```

Isso irá baixar a imagem necessária para executar a aplicação em seu ambiente local.

Para executar com o perfil "dev", utilize o seguinte comando:

```bash
docker run -d -p 8080:8080 -e PROFILE=dev pallestrelli/fiap-checkpoint2
```

Para executar com o perfil "stg", utilize o seguinte comando:

```bash
docker compose up
```

## Acesso à Aplicação (Perfil Dev) 
Após a execução da aplicação, você poderá acessá-la em `http://localhost:8080/h2-console`.
Isso estará disponível apenas quando você estiver executando a aplicação com o perfil "dev".

## Docker Compose && MySQL Tables (Perfil Stage)
Para o perfil "stg", utilizamos o Docker Compose, dessa forma, tanto o MySQL quanto a nossa aplicação estarão conteinerizados e acessíveis entre elas.
Com isso, as tabelas serão criadas dentro do seu banco de dados MySQL. 


## 📢📢 ATENÇÃO!!
Certifique-se de ter o Docker instalado e em execução em sua máquina antes de executar os comandos acima.

## Participantes

Este projeto foi desenvolvido por [Matheus Perestrelo, Gabriel Toledo].
