# be-application-kotlin
[WIP] Backend Application Kotlin

## Start LocalStack
```shell
./gradlew composeUp
```

## Setup DynamoDB
```shell
./gradlew localstack.init
./gradlew localstack.plan
./gradlew localstack.apply
```

## Run application with LocalStack
```shell
./gradlew bootRun --args='--spring.profiles.active=local'
```
