# Spring Boot Course

Proyecto inicial de **Spring Boot** dentro del repositorio `JavaHitss`.

Este módulo será la base para practicar desarrollo backend con Java, construcción de APIs REST, controladores, modelos de respuesta y, más adelante, servicios, lógica de negocio y persistencia de datos.

## Estado actual

El proyecto fue creado e iniciado el **10 de agosto** como primera práctica formal de Spring Boot dentro del semillero.

En este primer avance se trabajó principalmente en:

- Creación del proyecto Spring Boot con Maven.
- Configuración del Maven Wrapper.
- Configuración de Java 21.
- Primeros controladores REST.
- Primeros records para responder objetos desde endpoints.

## Tecnologías usadas

- Java 21
- Spring Boot 4.1.0
- Spring Web MVC
- Maven
- Maven Wrapper
- VS Code

## Estructura del proyecto

```text
springboot-course/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── src/
    ├── main/
    │   ├── java/com/dexenross/springboot_course/
    │   │   ├── SpringbootCourseApplication.java
    │   │   │
    │   │   ├── controller/
    │   │   │   ├── HelloController.java
    │   │   │   └── StudentController.java
    │   │   │
    │   │   └── model/
    │   │       ├── Student.java
    │   │       └── User.java
    │   │
    │   └── resources/
    │       └── application.properties
    │
    └── test/
        └── java/com/dexenross/springboot_course/
            └── SpringbootCourseApplicationTests.java
```

## Controladores actuales

### `HelloController`

Controlador inicial para probar respuestas simples y respuestas con objetos.

Endpoints:

| Método | Ruta | Respuesta |
|---|---|---|
| `GET` | `/hello` | Texto simple: `Hola Spring Boot`. |
| `GET` | `/saludo` | Texto simple de bienvenida al curso. |
| `GET` | `/usuario` | Objeto `User` en formato JSON. |

### `StudentController`

Controlador agrupado bajo la ruta base `/api`.

Endpoints:

| Método | Ruta | Respuesta |
|---|---|---|
| `GET` | `/api/student` | Objeto `Student` en formato JSON. |
| `GET` | `/api/course` | Texto simple con el nombre del curso. |
| `GET` | `/api/status` | Texto simple con el estado del aprendizaje. |

## Records actuales

### `User`

```java
public record User(String name, String role) {}
```

Se usa para responder información básica de usuario desde `/usuario`.

### `Student`

```java
public record Student(String name, String technology, int day) {}
```

Se usa para responder información del estudiante desde `/api/student`.

## Cómo ejecutar

Desde la carpeta del proyecto:

```bash
cd springboot-course
./mvnw spring-boot:run
```

En Windows:

```bash
cd springboot-course
mvnw.cmd spring-boot:run
```

Cuando la aplicación esté levantada, se pueden probar los endpoints desde el navegador, Postman, Insomnia o `curl`.

Ejemplos:

```bash
curl http://localhost:8080/hello
curl http://localhost:8080/saludo
curl http://localhost:8080/usuario
curl http://localhost:8080/api/student
curl http://localhost:8080/api/course
curl http://localhost:8080/api/status
```

## Qué se practica

- Estructura básica de un proyecto Spring Boot.
- Uso de `@SpringBootApplication`.
- Creación de controladores con `@RestController`.
- Mapeo de rutas con `@GetMapping`.
- Uso de `@RequestMapping` para definir rutas base.
- Respuestas de texto plano.
- Respuestas JSON usando records.
- Separación inicial por paquetes: `controller` y `model`.

## Próximos pasos

- Agregar servicios para separar lógica de negocio.
- Crear más endpoints REST.
- Recibir parámetros y datos desde peticiones HTTP.
- Agregar validaciones.
- Conectar una capa de persistencia.
- Practicar arquitectura por capas en Spring Boot.
