# Challenge module 6: Building a full fledged REST API

As the last part of the training, we are going to build a REST API. It's allows you to register heathings and retrieve every one of them.

The application is going to have two endpoints:
- An endpoint to register a new temperature. (PUT request)
- An endpoint to retrieve all registered temperatures (which can be used for example to create a nice graph). (GET request)

To get started, head to [spring initializr](https://start.spring.io/) and start by creating a boilerplate project. Make sure to choose Java 14 so that we can make use of the latest features.

We are going to need the following dependencies:

- Lombok
- Spring web
- JDBC API
- H2 Database
- Validation (JSR-303)

This generates a skeleton that we can use with everything correctly configured to get started right away.


