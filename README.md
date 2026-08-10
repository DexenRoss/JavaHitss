# JavaHitss

Repositorio de práctica para el **Semillero de Talentos HITSS**, enfocado en reforzar fundamentos de Java mediante ejercicios, mini proyectos y prácticas organizadas por tema.

## Descripción

Este repositorio documenta mi avance en Java desde los fundamentos del lenguaje hasta programación orientada a objetos, colecciones, programación funcional y el inicio de desarrollo backend con **Spring Boot**.

La intención es construir una base sólida de Java para después aplicarla en APIs y proyectos backend reales.

## Temas principales

- Fundamentos de Java
- Variables, operadores y entrada de datos
- Condicionales, ciclos y arreglos
- Programación orientada a objetos
- Encapsulamiento, herencia, abstracción y polimorfismo
- Interfaces, records, enums y sealed classes
- Excepciones checked y unchecked
- Lectura y escritura de archivos
- Genéricos y `Optional`
- Colecciones: `List`, `ArrayList`, `LinkedList`, `Set`, `HashSet`, `TreeSet`, `Queue`, `PriorityQueue`, `Map`, `HashMap`, `LinkedHashMap` y `TreeMap`
- Ordenamiento con `Comparable`, `Comparator`, `Collections.sort()` y `List.sort()`
- Programación funcional, lambdas, interfaces funcionales y streams
- Mini proyectos de consola
- Primer proyecto backend con Spring Boot

## Tecnologías usadas

- Java 21
- Spring Boot 4.1.0
- Spring Web MVC
- Maven y Maven Wrapper
- VS Code
- Git y GitHub
- Javadoc

## Estructura del repositorio

```text
JavaHitss/
├── variables/                    Fundamentos, tipos de datos, operadores y entrada de usuario.
├── controlFlujo/                 Condicionales, switch y ciclos.
├── arreglos/                     Arreglos, matrices, ordenamiento y métodos de Arrays.
├── poo/                          Primeras prácticas de POO con clases y objetos.
├── encapsulamiento/              Encapsulamiento con Customer.
├── encapsulamineto/              Encapsulamiento con Employee y validaciones.
├── herencia/                     Herencia, composición y sobrescritura.
├── abstraccion/                  Clases abstractas e interfaces.
├── polimorfismo/                 Polimorfismo, casting, records y sealed interfaces.
├── payment/                      Polimorfismo aplicado a métodos de pago.
├── enumeraciones/                Enums con atributos, métodos e interfaces.
├── excepciones/                  Excepciones checked, unchecked, throw, throws y try-catch.
├── archivos/                     Lectura y escritura de archivos.
├── genericos/                    Clases, métodos, interfaces y records genéricos.
├── gestionEmpleados/            Repository, Service, records y Optional.
├── listasArrayList/              List, ArrayList, Iterator, Optional y ordenamiento.
├── linkedList/                   LinkedList y operaciones básicas de listas enlazadas.
├── gestion_ticket/               Gestión de tickets con LinkedList y ListIterator.
├── conjuntos/                    Set y HashSet.
├── treeSet/                      TreeSet, NavigableSet y ordenamiento natural.
├── sistema_productos/            Productos, historial de acceso, LinkedHashSet y TreeMap.
├── productos_favoritos/          Productos favoritos con Set y lógica de servicio.
├── mapas/                        Map y operaciones básicas con clave-valor.
├── sistema_clientes/             Sistema de clientes usando Map y servicios.
├── estadisticas_productos/       Estadísticas de productos con Map y servicios.
├── atencion_tickets/             Atención de tickets con Queue y PriorityQueue.
├── citasMedicas/                 Sistema de citas médicas con colas y prioridades.
├── atencion_de_emergencias/      Atención de emergencias hospitalarias por prioridad.
├── programacion_funcional/       Lambdas, interfaces funcionales, reglas y streams.
├── sistema_notificaciones/       Sistema de notificaciones con records, sealed interface y Javadoc.
├── app_library/                  Mini proyecto de biblioteca.
├── clasesSealed/                 Records y sealed classes.
└── springboot-course/            Primer proyecto backend con Spring Boot.
```

> Nota: la carpeta `encapsulamineto` conserva el nombre que tiene actualmente en el repositorio.

## Proyectos y temas trabajados

| Carpeta | Tema principal | Qué se practica |
|---|---|---|
| `variables` | Fundamentos | Variables, tipos, operadores, cadenas y lectura con `Scanner`. |
| `controlFlujo` | Flujo de control | `if`, `switch`, `switch expression`, ciclos y ejercicios básicos. |
| `arreglos` | Arreglos y matrices | Arrays, matrices, búsquedas, ordenamiento y promedios. |
| `poo` | POO básica | Clases, objetos, atributos, métodos, constructores y entidades simples. |
| `encapsulamiento` / `encapsulamineto` | Encapsulamiento | Atributos privados, getters, setters y validaciones. |
| `herencia` | Herencia | Clases padre/hijas, composición, constructores, bonos y `@Override`. |
| `abstraccion` | Abstracción e interfaces | Clases abstractas, métodos abstractos, interfaces y métodos default/static/private. |
| `polimorfismo` | Polimorfismo | Referencias polimórficas, casting, pattern matching, records y sealed interface. |
| `payment` | Pagos | Clase base `Payment`, `CashPayment`, `CreditCardPayment`, `PaypalPayment` y polimorfismo. |
| `enumeraciones` | Enums | Enums simples, con atributos, métodos, métodos abstractos e interfaces. |
| `excepciones` | Manejo de errores | Excepciones checked/unchecked, `throw`, `throws`, `try-catch` y archivos. |
| `archivos` | Manejo de archivos | `FileWriter`, `BufferedWriter`, `Scanner`, `BufferedReader`, `Files` y `Path`. |
| `genericos` | Genéricos | `Box<T>`, `Pair<K,V>`, `Response<T,E>`, `Repository<T>`, records genéricos y `Optional`. |
| `gestionEmpleados` | Repository + Service | `Repository<T, ID>`, `EmployeeService`, `Optional`, `map`, `orElse` e `ifPresent`. |
| `listasArrayList` | Listas | `ArrayList`, `Iterator`, búsqueda con `Optional`, `Comparable` y `Comparator`. |
| `linkedList` | LinkedList | Operaciones básicas sobre listas enlazadas. |
| `gestion_ticket` | Tickets | `LinkedList`, `ListIterator`, inserción, eliminación y recorrido bidireccional. |
| `conjuntos` | Sets | `HashSet`, elementos únicos y comportamiento de `add()`. |
| `treeSet` | Sets ordenados | `TreeSet`, ordenamiento natural y navegación de conjuntos. |
| `sistema_productos` | Colecciones aplicadas | Historial de productos, registros, `LinkedHashSet`, `TreeMap` y lógica de servicio. |
| `productos_favoritos` | Favoritos | Set de productos favoritos y operaciones de servicio. |
| `mapas` | Map | Estructuras clave-valor y operaciones básicas con mapas. |
| `sistema_clientes` | Clientes con Map | Registro, búsqueda y administración de clientes con mapas. |
| `estadisticas_productos` | Estadísticas | Conteo y acumulación de datos con mapas y servicios. |
| `atencion_tickets` | Queue | Atención de tickets con colas y prioridades. |
| `citasMedicas` | Citas médicas | Manejo de citas, ordenamiento y atención por prioridad. |
| `atencion_de_emergencias` | Emergencias | Priorización de casos hospitalarios con comparadores y servicios. |
| `programacion_funcional` | Programación funcional | Lambdas, interfaces funcionales, reglas, métodos de referencia y streams. |
| `sistema_notificaciones` | Notificaciones | Records, sealed interface, enum, validaciones, switch moderno y Javadoc. |
| `springboot-course` | Spring Boot | Maven, Spring Web MVC, controladores REST, endpoints y records de respuesta. |

## Mini proyectos destacados

### `springboot-course`

Primer proyecto backend del repositorio usando **Spring Boot**. El 10 de agosto se creó e inició el proyecto; se trabajaron los primeros controladores y records:

- `HelloController` con endpoints `/hello`, `/saludo` y `/usuario`.
- `StudentController` con base `/api` y endpoints `/student`, `/course` y `/status`.
- Record `User` para responder información de usuario.
- Record `Student` para responder información de estudiante.
- Configuración Maven con Java 21 y Spring Boot 4.1.0.

### `programacion_funcional`

Prácticas de programación funcional en Java:

- Lambdas.
- Interfaces funcionales.
- Reglas de negocio con `ProductRule`.
- Uso de records `Product` y `Employee`.
- Primeros ejercicios con streams.

### `atencion_de_emergencias`

Mini proyecto de atención hospitalaria que organiza emergencias por prioridad:

- Modelo `EmergencyCase`.
- Servicio `EmergencyService`.
- Comparador `EmergencyComparator`.
- Atención de casos según prioridad.

### `citasMedicas`

Mini proyecto de gestión de citas médicas:

- Modelo `Appointment`.
- Servicio `AppointmentService`.
- Comparador `AppointmentComparator`.
- Registro y atención de citas.

### `sistema_clientes`, `estadisticas_productos` y `mapas`

Prácticas enfocadas en `Map` y variantes como `HashMap`, `LinkedHashMap` y `TreeMap`:

- Registro y consulta por clave.
- Conteo y acumulación de estadísticas.
- Preservación de orden de inserción.
- Ordenamiento por clave.

## Cómo ejecutar

### Proyectos Java de consola

Entra al módulo y compila la clase de prueba correspondiente:

```bash
cd gestionEmpleados/src
javac test/TestEmployee.java
java test.TestEmployee
```

```bash
cd programacion_funcional/src
javac App.java
java App
```

```bash
cd atencion_de_emergencias/src
javac App.java
java App
```

### Proyecto Spring Boot

```bash
cd springboot-course
./mvnw spring-boot:run
```

En Windows:

```bash
cd springboot-course
mvnw.cmd spring-boot:run
```

Endpoints iniciales:

```text
GET /hello
GET /saludo
GET /usuario
GET /api/student
GET /api/course
GET /api/status
```

## Requisitos sugeridos

- Java 21
- VS Code con Extension Pack for Java
- Maven o Maven Wrapper
- Git

## Avance actual

- [x] Fundamentos de Java
- [x] Control de flujo
- [x] Arreglos y matrices
- [x] Programación orientada a objetos
- [x] Encapsulamiento
- [x] Herencia
- [x] Abstracción e interfaces
- [x] Polimorfismo
- [x] Enums
- [x] Records y sealed classes
- [x] Excepciones
- [x] Archivos
- [x] Genéricos
- [x] Optional
- [x] Listas, conjuntos, colas y mapas
- [x] Programación funcional
- [x] Mini proyectos de consola
- [x] Inicio de proyecto Spring Boot
- [x] Controladores REST iniciales
- [x] Records para respuestas HTTP
- [ ] Servicios y lógica de negocio en Spring Boot
- [ ] Persistencia de datos

## Próxima etapa

Continuar el proyecto `springboot-course` agregando servicios, capas de negocio, manejo de peticiones HTTP más completas y eventualmente persistencia de datos.

## Autor

**Emilio Caballero**  
Repositorio de aprendizaje para el camino por HITSS.
