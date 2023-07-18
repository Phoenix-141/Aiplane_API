# Initalize the project

Up to container with docker

```shell
docker-compose up -d
```

Resolve depedencies

```shell
mvn dependency:resolve
```

Execute migrations (This is automatic)

```shell
mvn flyway:migrate
```

Start spring-boot with maven 

```shell
mvn spring-boot:run
```

Accsses the local postgresSQL with 

```shell
docker-compose exec db psql -U USERNAME -d DATABASE
```

> The Hibernate is automatic