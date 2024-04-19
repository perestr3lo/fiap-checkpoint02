## 🚀 README.md

Este repositório contém a aplicação Fiap Checkpoint 01.

### Prérequisitos
* Java 17+
* Docker
* Acesso a internet
* Acesso ao Docker Hub


### Instruções de Uso

Antes de executar a aplicação, você precisa obter a imagem do Docker Hub. Para fazer isso, utilize o seguinte comando:

```bash
docker pull pallestrelli/fiap-checkpoint2
```

Isso irá baixar a imagem necessária para executar a aplicação em seu ambiente local.

Para executar com perfil "dev", utilize o seguinte comando:
```bash
docker run -d -p 8080:8080 -e PROFILE=dev pallestrelli/fiap-checkpoint2
```

Para executar com perfil "stg", utilize o seguinte comando:

```bash
docker run -d -p 8080:8080 -e PROFILE=stg pallestrelli/fiap-checkpoint1
```

## Acesso à Aplicação
Após a execução da aplicação, você poderá acessá-la em `http://localhost:8080/h2-console`.
Isso quando você estiver executando a aplicação a partir do "profile" <DEV> caso contrário essa rota não estara disponível.

## Criar tabelas MySQL
Para replicar as tabelas dentro do seu banco MySQL você podera utilizar o **Docker Compose** dessa maneira nossa aplicação estara toda containerizada.
```bash
docker compose up 
```



## 📢📢 ATENÇÃO!!
Certifique-se de ter o Docker instalado e em execução em sua máquina antes de executar os comandos acima.

## Participantes

Este projeto foi desenvolvido por [Matheus Perestrelo, Gabriel Toledo].
