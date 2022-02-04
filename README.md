# Client REST API

Client Rest API Technical Assessment

Backend Service that exposes 2 REST APIs
1. Rest API that allows for Creating, Updating and Searching for a Client

## Getting Started

* Using either an Eclipse IDE or IntelliJ, import the source code as an Existing Maven Project. 

## Prerequisites

* Install [Java SDK](https://openjdk.java.net/)
* [Java SDK 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Required only for JUnit tests using CodeSV mock services.
* Install [Apache Maven](https://maven.apache.org/install.html)
* Install Intellij/Eclipse , [Spring Tools Suite](https://spring.io/tools) or [IntelliJ](https://www.jetbrains.com/idea/)
Install [Lombok](https://projectlombok.org/) Plugin to your favourite IDE - Lombok allows you to never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.

## Executing Tests

* JUnit Tests - Execute ```mvn clean test```

## Packaging

* To create a deployment package, execute ```mvn clean package```

## Deployment

The Client Rest API can be deployed as a single standalone application service.

* Deploy as a Jar file ```java -jar target\client-rest-api-0.0.1-SNAPSHOT.jar```
  
## API Documentation

* Swagger UI @ http://{hostname}:{port}/swagger-ui.html
* Localhost: http://localhost:8080/swagger-ui.html

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - Application Framework
* [Swagger](https://swagger.io/) - API Documentation
* [Apache Maven](https://maven.apache.org/) - Software Project Management
* [H2 Database Engine](https://www.h2database.com/html/main.html) - In-Memory Database
* [JUnit 5](https://junit.org/junit5/) - Unit Testing Framework
