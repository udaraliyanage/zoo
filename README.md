# Zoo Application

Zoo application that model several types of animals and expose REST apis to query them.

You can refer to [class diagram](src/main/resources/docs/class_diagram.png) to visually see class modeling.

## Installation

Java Version - 15

```
java -jar target/zoo-1.0-SNAPSHOT.jar
```

Fetch All Animals
```bash
curl localhost:8080/api/animal
```

Fetch Walking Animals
```bash
curl localhost:8080/api/animal?type=walking
```

Fetch Swimming Animals
```bash
curl localhost:8080/api/animal?type=swimming
```

## Assumptions

1. Caterpillar to Butterfly transformation.

Insect can be in either in caterpillar status of butterfly status. Butterfly can fly but not caterpillar.
The caller who has reference to an insect object is supposed to use canFly() before calling fly().

## Enhancements

1. Write [contract tests](https://spring.io/projects/spring-cloud-contract) for REST API.
