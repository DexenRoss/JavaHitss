# JavaHitss

Repositorio de práctica para el **Semillero de Talentos HITSS**, enfocado en reforzar fundamentos de Java mediante ejercicios, mini proyectos y prácticas organizadas por tema.

## Descripción

Este repositorio documenta mi avance en Java desde los fundamentos del lenguaje hasta conceptos de programación orientada a objetos y características modernas del ecosistema Java.

El objetivo es construir una base sólida para después aplicar estos conocimientos en proyectos backend con **Spring Boot**.

## Temas principales

- Fundamentos de Java
- Variables, operadores y entrada de datos
- Condicionales y ciclos
- Arreglos y matrices
- Encapsulamiento
- Herencia y composición
- Abstracción e interfaces
- Polimorfismo
- Enumeraciones (`enum`)
- Excepciones checked y unchecked
- Lectura y escritura de archivos
- Genéricos
- `Optional`
- Repositorios y servicios con tipos genéricos
- Clases `final`
- `records`
- `sealed classes`
- Switch moderno con pattern matching
- Generación de documentación con Javadoc
- Mini proyectos orientados a objetos

## Tecnologías usadas

- Java
- Java 14+ para prácticas con `switch expression`
- Java 17+ para prácticas con `records` y `sealed classes`
- Java 21+ para prácticas con `switch` moderno y pattern matching
- VS Code
- Git y GitHub
- Javadoc

## Estructura del repositorio

```text
JavaHitss/
├── variables/
│   └── Fundamentos de Java, tipos primitivos, operadores, Scanner e instanceof.
│
├── controlFlujo/
│   └── Condicionales, switch, switch expression, ciclos for, while y ciclos anidados.
│
├── arreglos/
│   └── Arreglos, matrices, búsquedas, ordenamiento y métodos de la clase Arrays.
│
├── encapsulamineto/
│   └── Atributos privados, getters, setters, validaciones y alcance de variables/métodos.
│
├── herencia/
│   └── POO con clases padre e hijas, composición, constructores, excepciones,
│       bonos, @Override y métodos polimórficos como showInformation().
│
├── abstraccion/
│   └── Clases abstractas, métodos abstractos, métodos concretos, polimorfismo
│       e interfaces.
│
├── polimorfismo/
│   └── Prácticas de polimorfismo, casting, instanceof con pattern matching,
│       clases abstractas, records, sealed interfaces y switch sobre tipos.
│
├── enumeraciones/
│   └── Prácticas con enum, atributos, métodos, switch expressions,
│       métodos abstractos en enum e implementación de interfaces.
│
├── excepciones/
│   └── Prácticas con excepciones checked, unchecked, throw, throws y manejo con try-catch.
│
├── archivos/
│   └── Prácticas de lectura y escritura de archivos con FileWriter,
│       BufferedWriter, Scanner, BufferedReader, Files y Path.
│
├── genericos/
│   └── Prácticas con clases, métodos e interfaces genéricas, Pair,
│       Response, Repository, Optional y records genéricos.
│
├── gestionEmpleados/
│   └── Mini proyecto de gestión de empleados usando Repository<T, ID>,
│       servicios, records y Optional.
│
├── app_library/
│   └── Mini proyecto de biblioteca con Book, Library e ISBN.
│       Practica arreglos dinámicos, búsqueda, eliminación, validación,
│       clases final, equals, hashCode y toString.
│
├── sistema_notificaciones/
│   └── Mini proyecto de sistema de notificaciones empresariales.
│       Usa records, sealed interface, enum, validaciones, arreglos,
│       switch moderno con pattern matching y Javadoc.
│
└── clasesSealed/
    ├── records/
    │   └── Prácticas con records, constructores compactos, métodos propios
    │       y comparación contra clases tradicionales.
    │
    └── sealed/
        └── Prácticas con sealed, non-sealed y final classes usando una jerarquía
            de vehículos.
```

> Nota: la carpeta `encapsulamineto` conserva el nombre que tiene actualmente en el repositorio.

## Proyectos y temas trabajados

| Carpeta | Tema principal | Qué se practica |
|---|---|---|
| `variables` | Fundamentos de Java | Variables primitivas, operadores matemáticos/lógicos, `instanceof` y entrada con `Scanner`. |
| `controlFlujo` | Flujo de control | `if`, `switch`, `switch expression`, `yield`, ciclos `for`, `while`, ciclos anidados y números aleatorios. |
| `arreglos` | Arreglos y matrices | Creación, llenado y recorrido de arreglos; `Arrays.sort`, `Arrays.fill`, `Arrays.binarySearch`, `Arrays.copyOf`, matrices y cálculo de promedios. |
| `encapsulamineto` | Encapsulamiento | Atributos privados, getters/setters, validaciones de datos, métodos de actualización y alcance de miembros. |
| `herencia` | POO con herencia | Clases `Person`, `Employee`, `Teacher`, `Administrative`, `Sales`, composición, constructores, excepciones, bonos y `@Override`. |
| `abstraccion` | Abstracción e interfaces | Clases abstractas `Vehicle` y `Shape`, clases concretas, interfaces `Flyable` y `Printer`, métodos `default`, `static` y `private`. |
| `polimorfismo` | Polimorfismo y tipos sellados | `Employee`, `Developer`, `Manager`, `instanceof`, casting, `sealed interface Result`, records y switch por tipo. |
| `enumeraciones` | Enumeraciones | `OrderStatus`, `Priority`, `UserRole`, `Season`, `Operation`, `DocumentType`, switch expressions, métodos abstractos e interfaces. |
| `excepciones` | Manejo de errores | Excepciones checked y unchecked, `InsufficientStockException`, `InvalidOrderException`, `throw`, `throws` y `try-catch`. |
| `archivos` | Manejo de archivos | Escritura con `FileWriter`/`BufferedWriter` y lectura con `Scanner`, `BufferedReader`, `Files.readString`, `Files.lines` y `Files.readAllLines`. |
| `genericos` | Genéricos y Optional | `Box<T>`, `Pair<K,V>`, `Response<T,E>`, métodos genéricos, `Repository<T>`, records genéricos y `Optional`. |
| `gestionEmpleados` | Mini proyecto con Repository y Service | `Employee`, `Repository<T, ID>`, `EmployeeRepositoryImpl`, `EmployeeService`, `Optional`, `map`, `orElse` e `ifPresent`. |
| `app_library` | Mini proyecto de biblioteca | `Book`, `Library`, `ISBN`, validaciones, búsqueda, eliminación, autores únicos, ISBN únicos, `equals`, `hashCode` y `toString`. |
| `sistema_notificaciones` | Sistema de notificaciones empresariales | Records de notificación, sealed interface `Notification`, enum `NotificationType`, procesador, validaciones, switch moderno y Javadoc. |
| `clasesSealed/records` | Records | Declaración de `record`, constructor compacto, validaciones, métodos propios, métodos estáticos y comparación con clases normales. |
| `clasesSealed/sealed` | Sealed classes | Jerarquías controladas con `sealed`, `permits`, `final` y `non-sealed`. |
| `Spring Boot` | Siguiente etapa | Desarrollo backend aplicando los fundamentos aprendidos durante el semillero. |

## Documentación por módulo

Además del README principal, varios proyectos tienen su propio README con objetivo, estructura, conceptos practicados y comandos de ejecución:

- `encapsulamineto/README.md`
- `herencia/README.md`
- `abstraccion/README.md`
- `polimorfismo/README.md`
- `enumeraciones/README.md`
- `excepciones/README.md`
- `archivos/README.md`
- `genericos/README.md`
- `gestionEmpleados/README.md`
- `app_library/README.md`
- `clasesSealed/README.md`
- `clasesSealed/records/README.md`
- `sistema_notificaciones/README.md`

## Mini proyectos y prácticas destacadas

### `gestionEmpleados`

Mini proyecto para practicar una estructura tipo repositorio/servicio usando genéricos y `Optional`.

- `Employee` como `record`.
- Interface `Repository<T, ID>`.
- Implementación `EmployeeRepositoryImpl`.
- Interface `EmployeeService`.
- Implementación `EmployeeServiceImpl`.
- Búsqueda por identificador.
- Uso de `Optional.empty()`, `Optional.of()`, `map()`, `ifPresent()` y `orElse()`.

### `sistema_notificaciones`

Mini proyecto en Java para representar y procesar distintos tipos de notificaciones empresariales.

- Notificaciones por correo electrónico, SMS y push notification.
- Interface sellada `Notification`.
- Records `EmailNotification`, `SmsNotification` y `PushNotification`.
- Enum `NotificationType`.
- Clase `NotificationProcessor`.
- Validaciones con `IllegalArgumentException`.
- `switch` moderno con pattern matching.
- Generación de documentación con Javadoc.

### `app_library`

Mini proyecto orientado a objetos que simula una biblioteca.

- Registro de libros con `Book`.
- Identificador `ISBN` como clase `final` con validación.
- Administración de libros mediante `Library`.
- Búsqueda, eliminación, autores únicos e ISBN únicos.
- Uso de `Arrays.copyOf()`.
- Sobrescritura de `equals()`, `hashCode()` y `toString()`.

### `archivos`

Práctica de manejo de archivos.

- Escritura con `FileWriter` y `BufferedWriter`.
- Lectura con `Scanner`.
- Lectura con `BufferedReader`.
- Lectura con `Files.readString()`.
- Lectura con `Files.lines()`.
- Lectura con `Files.readAllLines()`.
- Manejo de `IOException` y `FileNotFoundException`.
- Uso de try-with-resources.

### `genericos`

Práctica de genéricos en Java.

- Clases genéricas `Box<T>`, `Pair<K,V>` y `Response<T,E>`.
- Métodos genéricos.
- Constructores genéricos.
- Interfaces genéricas con `Repository<T>`.
- Implementaciones con tipos concretos.
- Records genéricos como `Result<T>`.
- Uso de `Optional` para evitar valores nulos.

### `excepciones`

Práctica de manejo de excepciones.

- Excepción checked `InsufficientStockException`.
- Excepción unchecked `InvalidOrderException`.
- Uso de `throw` y `throws`.
- Captura con `try-catch`.
- Validaciones de orden y stock.

## Cómo ejecutar los ejercicios

Cada carpeta funciona como un proyecto o conjunto de ejercicios independiente. Para probarlos:

1. Abre el repositorio en VS Code.
2. Entra a la carpeta del tema que quieras revisar.
3. Busca una clase con método `main`, normalmente dentro de `src`.
4. Ejecuta el archivo desde VS Code o desde terminal.

Ejemplo para gestión de empleados:

```bash
cd gestionEmpleados/src
javac test/TestEmployee.java
java test.TestEmployee
```

Ejemplo para genéricos:

```bash
cd genericos/src
javac test/Test.java
java test.Test
```

Ejemplo para Optional:

```bash
cd genericos/src
javac optionals/TestOptional.java
java optionals.TestOptional
```

Ejemplo para excepciones:

```bash
cd excepciones/src
javac test/TestExceptionNew.java
java test.TestExceptionNew
```

Ejemplo para archivos:

```bash
cd archivos
javac src/test/FileRead.java
java -cp src test.FileRead
```

Ejemplo para el sistema de notificaciones:

```bash
cd sistema_notificaciones/src
javac classes/*.java enums/*.java service/*.java test/TestNotifications.java
java test.TestNotifications
```

> Nota: algunas carpetas fueron creadas como proyectos Java de VS Code, por lo que pueden incluir carpetas como `bin`, `.vscode` o archivos generados por el entorno.

## Requisitos sugeridos

Para la mayoría de ejercicios basta con tener Java instalado. Para las prácticas más recientes se recomienda:

- Java 14 o superior para `switch expression`.
- Java 17 o superior para `records` y `sealed classes`.
- Java 21 o superior para `switch` moderno con pattern matching.
- VS Code con Extension Pack for Java.

## Avance actual

- [x] Variables y tipos de datos
- [x] Operadores y entrada de datos
- [x] Condicionales y ciclos
- [x] Switch tradicional y switch expression
- [x] Arreglos y matrices
- [x] Encapsulamiento
- [x] Herencia y composición
- [x] Abstracción e interfaces
- [x] Polimorfismo
- [x] Enumeraciones (`enum`)
- [x] Excepciones checked y unchecked
- [x] Manejo de archivos
- [x] Genéricos
- [x] Optional
- [x] Records
- [x] Sealed classes
- [x] Mini proyecto de biblioteca
- [x] Sistema de notificaciones empresariales
- [x] Gestión de empleados con Repository y Service
- [x] Javadoc
- [ ] Proyecto final con Spring Boot

## Próxima etapa

Aplicar los fundamentos practicados en este repositorio dentro de un proyecto backend con **Spring Boot**, integrando buenas prácticas de programación orientada a objetos, estructura de capas y manejo de datos.

## Autor

**Emilio Caballero**  
Repositorio de aprendizaje para el camino por HITSS.
