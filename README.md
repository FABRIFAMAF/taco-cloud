# Taco Cloud 🌮

Aplicación web desarrollada con Spring Boot basada en el proyecto
Taco Cloud del libro "Spring in Action" de Craig Walls. 
A lo largo del libro se desarrollan conceptos practicos e internos sobre el framework
mientras se desarrolla el proyecto.
Algunas decisiones llevaron a tomar caminos separados del libro y proyecto original, una de las diferencias
que mas destaca es que la implementacion de persistencia se realiza con Spring JDBC y no con Spring Jpa como
lo hace el libro finalmente, esto no quiere decir que sea mejor o mas eficiente, simplemente tiene que ver
con una cuestion de comprender el funcionamiento de la persistencia relacional sin utilizar un ORM.


## Tecnologias

- Java 21
- Spring Boot
- Spring MVC
- Spring Security
- Spring Data JDBC
- Thymeleaf
- H2 Database
- Maven
- Lombok


## Funcionalidades
- Creacion de usuario
- Guardado de usuario en base de datos
- Creacion de un taco personalizado
- Tomar informacion del pedido
- Guardado del taco y orden solicitada en base de datos
- Inicio y cierre de cesion


## Project structure

    Config/
    Controller/
    Converter/
    Domain/
    Repository/
    Security/
resources/
      static/
          templates/


