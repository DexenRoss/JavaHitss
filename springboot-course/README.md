# Spring Boot Course

Proyecto inicial de **Spring Boot** dentro del repositorio `JavaHitss`.

Este módulo será la base para practicar desarrollo backend con Java, construcción de APIs REST, controladores, manejo de peticiones HTTP, separación por capas y, más adelante, persistencia de datos.

## Estado actual

El proyecto fue creado e iniciado el **10 de agosto** como primera práctica formal de Spring Boot dentro del semillero.

En el primer avance se trabajaron los controladores iniciales y los primeros `record` para responder objetos en JSON. En la actualización más reciente se avanzó hacia una **arquitectura por capas**, separando responsabilidades entre controlador, servicio y repositorio.

## Avances trabajados

- Creación del proyecto Spring Boot con Maven.
- Configuración del Maven Wrapper.
- Configuración de Java 21.
- Uso de Spring Boot 4.1.0.
- Primeros controladores REST.
- Endpoints con `GET` y `POST`.
- Recepción de JSON con `@RequestBody`.
- Captura de variables de ruta con `@PathVariable`.
- Uso de `ResponseEntity` para responder con códigos HTTP.
- Respuesta `201 CREATED` al crear estudiantes.
- Respuesta `404 NOT FOUND` cuando no se encuentra un estudiante.
- Records para representar datos de entrada y salida.
- Separación en capas: `controller`, `service`, `repository` y `model`.

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
    │   │   ├── model/
    │   │   │   ├── CreateStudentRequest.java
    │   │   │   ├── Student.java
    │   │   │   └── User.java
    │   │   │
    │   │   ├── repository/
    │   │   │   └── StudentRepository.java
    │   │   │
    │   │   └── service/
    │   │       └── StudentService.java
    │   │
    │   └── resources/
    │       └── application.properties
    │
    └── test/
        └── java/com/dexenross/springboot_course/
            └── SpringbootCourseApplicationTests.java
```

## Arquitectura actual

El proyecto ya separa responsabilidades en tres capas principales:

| Capa | Clase | Responsabilidad |
|---|---|---|
| Controller | `StudentController` | Recibe peticiones HTTP y construye respuestas con `ResponseEntity`. |
| Service | `StudentService` | Contiene la lógica de aplicación y coordina las operaciones. |
| Repository | `StudentRepository` | Administra la colección en memoria de estudiantes. |
| Model | `Student`, `User`, `CreateStudentRequest` | Representa datos de entrada y salida mediante records. |

## Controladores actuales

### `HelloController`

Controlador inicial para probar respuestas simples y respuestas con objetos.

| Método | Ruta | Respuesta |
|---|---|---|
| `GET` | `/hello` | Texto simple: `Hola Spring Boot`. |
| `GET` | `/saludo` | Texto simple de bienvenida al curso. |
| `GET` | `/usuario` | Objeto `User` en formato JSON. |

### `StudentController`

Controlador principal de estudiantes. Actualmente usa la ruta base:

```text
/api/students
```

Endpoints actuales:

| Método | Ruta | Qué hace |
|---|---|---|
| `GET` | `/api/students` | Lista todos los estudiantes registrados en memoria. |
| `GET` | `/api/students/{id}` | Busca un estudiante por id. Devuelve `200 OK` si existe o `404 NOT FOUND` si no existe. |
| `POST` | `/api/students` | Crea un estudiante a partir de un JSON y responde `201 CREATED`. |

## Records actuales

### `User`

```java
public record User(String name, String role) {}
```

Se usa para responder información básica de usuario desde `/usuario`.

### `Student`

```java
public record Student(Long id, String name, String technology, int day) {}
```

Representa un estudiante ya creado. Incluye `id`, nombre, tecnología y día del curso.

### `CreateStudentRequest`

```java
public record CreateStudentRequest(String name, String technology, int day) {}
```

Representa el JSON que llega en una petición `POST` para crear un estudiante.

Ejemplo de JSON:

```json
{
  "name": "Emilio",
  "technology": "Spring Boot",
  "day": 2
}
```

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
curl http://localhost:8080/api/students
curl http://localhost:8080/api/students/1
```

Ejemplo para crear un estudiante:

```bash
curl -X POST http://localhost:8080/api/students \
  -H "Content-Type: application/json" \
  -d '{"name":"Emilio","technology":"Spring Boot","day":2}'
```

## Qué se aprende

- Estructura básica de un proyecto Spring Boot.
- Uso de `@SpringBootApplication`.
- Creación de controladores con `@RestController`.
- Mapeo de rutas con `@GetMapping`, `@PostMapping` y `@RequestMapping`.
- Uso de `@PathVariable` para leer datos desde la URL.
- Uso de `@RequestBody` para recibir JSON.
- Respuestas HTTP con `ResponseEntity`.
- Códigos de estado como `201 CREATED` y `404 NOT FOUND`.
- Respuestas JSON usando records.
- Separación por capas con `controller`, `service`, `repository` y `model`.
- Uso de `Optional` para representar búsquedas que pueden no encontrar datos.

## Próximos pasos

- Agregar validaciones a los datos recibidos.
- Implementar actualización y eliminación de estudiantes.
- Manejar errores de forma centralizada.
- Conectar una base de datos real.
- Agregar persistencia con Spring Data JPA.
- Escribir pruebas para controladores, servicios y repositorios.
