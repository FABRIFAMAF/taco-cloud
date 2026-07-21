# Taco Cloud 🌮

Aplicación web desarrollada con Spring Boot basada en el proyecto
Taco Cloud del libro "Spring in Action" de Craig Walls. 
A lo largo del libro se desarrollan conceptos practicos e internos sobre el framework
mientras se desarrolla el proyecto.
Algunas decisiones llevaron a tomar caminos separados del libro y proyecto original, una de las diferencias
que mas destaca es que la implementacion de persistencia se realiza con Spring DATA JDBC y no con Spring Jpa como lo hace el libro finalmente, esto no quiere decir que sea mejor o mas eficiente, simplemente tiene que ver
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
- Bean Validation
- BCrypt Password Encoder


## Funcionalidades

- Registro de usuarios
- Inicio y cierre de sesión
- Autenticación mediante Spring Security
- Encriptación de contraseñas con BCrypt
- Creación de tacos personalizados
- Creación y almacenamiento de pedidos
- Validación de formularios
- Persistencia utilizando Spring Data JDBC
- Protección CSRF


## Estructura del proyecto

Config/
    Configuración general de Spring

Controller/
    Controladores MVC

Converter/
    Conversión de datos enviados desde los formularios

Domain/
    Entidades del dominio

Repository/
    Acceso a datos mediante Spring Data JDBC

Security/
    Configuración de autenticación y autorización

resources/
    static/
        Recursos estáticos

    templates/
        Vistas Thymeleaf


## Decisiones técnicas

Uno de los objetivos principales de este proyecto fue comprender el funcionamiento interno del ecosistema Spring y evitar tratar al framework como una "caja negra".

Por ese motivo, aunque el libro termina implementando la persistencia con Spring Data JPA, se optó por utilizar Spring Data JDBC. Esta decisión permitió trabajar de una forma más cercana al modelo relacional y comprender con mayor detalle cómo Spring construye la capa de acceso a datos sin recurrir a un ORM completo.

El objetivo de esta decisión no fue reemplazar JPA, sino ampliar el conocimiento sobre las diferentes alternativas de persistencia que ofrece el framework.

## Conceptos trabajados

Durante el desarrollo del proyecto se trabajó con:

- Spring MVC
- Spring Security
- Spring Data JDBC
- Bean Validation
- Thymeleaf
- BCrypt
- Manejo de sesiones
- Autenticación y autorización
- Protección CSRF
- Arquitectura MVC


## Posibles mejoras

- Migrar la base de datos a MySQL o PostgreSQL.
- Incorporar Docker para simplificar el despliegue.
- Implementar OAuth2 (Google/GitHub).
- Agregar historial de pedidos por usuario.
- Mejorar la interfaz de usuario.

