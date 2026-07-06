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
- Abstracción
- Interfaces
- Polimorfismo
- Enumeraciones (`enum`)
- Clases `final`
- `records`
- `sealed classes`
- Switch moderno con pattern matching
- Manejo de excepciones
- Generación de documentación con Javadoc
- Sobrescritura de métodos
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
├── encapsulamiento/
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

## Proyectos y temas trabajados

| Carpeta | Tema principal | Qué se practica |
|---|---|---|
| `variables` | Fundamentos de Java | Variables primitivas, operadores matemáticos/lógicos, `instanceof` y entrada con `Scanner`. |
| `controlFlujo` | Flujo de control | `if`, `switch`, `switch expression`, `yield`, ciclos `for`, `while`, ciclos anidados y números aleatorios. |
| `arreglos` | Arreglos y matrices | Creación, llenado y recorrido de arreglos; `Arrays.sort`, `Arrays.fill`, `Arrays.binarySearch`, `Arrays.copyOf`, matrices y cálculo de promedios. |
| `encapsulamiento` | Encapsulamiento | Atributos privados, getters/setters, validaciones de datos, métodos de actualización y alcance de miembros. |
| `herencia` | Programación orientada a objetos | Clases `Person`, `Employee`, `Teacher`, `Administrative`, `Sales`, herencia, composición, constructores, excepciones, bonos y `@Override`. |
| `abstraccion` | Abstracción e interfaces | Clases abstractas `Vehicle` y `Shape`, clases concretas `Car`, `Circle`, `Square`, polimorfismo, interfaces `Flyable` y `Printer`, métodos `default`, `static` y `private` en interfaces. |
| `polimorfismo` | Polimorfismo y tipos sellados | Clase abstracta `Employee`, clases `Developer` y `Manager`, referencias polimórficas, `instanceof`, casting, `sealed interface Result`, records `Success`, `Error`, `Adverticement` y switch por tipo. |
| `enumeraciones` | Enumeraciones | `OrderStatus`, `Priority`, `UserRole`, `Season`, `Operation`, `DocumentType`, atributos en enum, métodos, `toString()`, `compareTo()`, switch expressions, métodos abstractos e interfaces. |
| `app_library` | Mini proyecto de biblioteca | Modelo `Book`, clase `Library`, clase `ISBN`, validaciones, búsqueda, eliminación, conteo de autores, ISBN únicos, `equals`, `hashCode` y `toString`. |
| `sistema_notificaciones` | Sistema de notificaciones empresariales | Records `EmailNotification`, `SmsNotification`, `PushNotification`, sealed interface `Notification`, enum `NotificationType`, procesador de notificaciones, validaciones, arreglos, switch moderno y Javadoc. |
| `clasesSealed/records` | Records | Declaración de `record`, constructor compacto, validaciones, métodos propios, métodos estáticos y comparación con clases normales. |
| `clasesSealed/sealed` | Sealed classes | Jerarquías controladas con `sealed`, `permits`, `final` y `non-sealed`. |
| `Spring Boot` | Siguiente etapa | Desarrollo de un proyecto backend aplicando los fundamentos aprendidos durante el semillero. |

## Mini proyectos y prácticas destacadas

### `sistema_notificaciones`

Mini proyecto en Java para representar y procesar distintos tipos de notificaciones empresariales. Incluye:

- Notificaciones por correo electrónico, SMS y push notification.
- Interface sellada `Notification`.
- Records `EmailNotification`, `SmsNotification` y `PushNotification`.
- Enum `NotificationType` para identificar el tipo de notificación.
- Clase `NotificationProcessor` para recorrer y procesar un arreglo `Notification[]`.
- Validaciones con `IllegalArgumentException` en constructores compactos.
- Uso de `switch` moderno con pattern matching.
- Separación por paquetes: `classes`, `enums`, `service` y `test`.
- Generación de documentación con Javadoc.

### `app_library`

Mini proyecto orientado a objetos que simula una biblioteca. Incluye:

- Registro de libros con `Book`.
- Identificador `ISBN` como clase `final` con validación.
- Administración de libros mediante la clase `Library`.
- Búsqueda por ISBN.
- Eliminación de libros.
- Conteo de autores únicos.
- Obtención de ISBN únicos.
- Uso de `Arrays.copyOf()` para manejar arreglos dinámicos.
- Sobrescritura de `equals()`, `hashCode()` y `toString()`.

### `herencia`

Práctica de programación orientada a objetos con una jerarquía de empleados. Incluye:

- Clase padre `Employee`.
- Clases hijas como `Administrative` y `Sales`.
- Constructores con validaciones.
- Cálculo de bonos.
- Sobrescritura de métodos con `@Override`.
- Método `showInformation()` para mostrar información específica según el tipo de empleado.

### `abstraccion`

Práctica enfocada en clases abstractas, polimorfismo e interfaces. Incluye:

- Clase abstracta `Vehicle` con método abstracto `startEngine()` y método concreto `stop()`.
- Clase `Car` como implementación concreta de `Vehicle`.
- Clase abstracta `Shape` con método abstracto `area()` y método concreto `show()`.
- Clases `Circle` y `Square` como implementaciones concretas de `Shape`.
- Interface `Flyable` implementada por `Bird`.
- Interface `Printer` con constante, método abstracto, método `default`, método `static` y método `private`.

### `polimorfismo`

Práctica centrada en el uso de referencias polimórficas y modelado de resultados. Incluye:

- Clase abstracta `Employee`.
- Implementaciones concretas `Developer` y `Manager`.
- Sobrescritura de métodos `work()` y `calculateSalary()`.
- Uso de referencias de tipo padre apuntando a objetos hijo.
- Uso de `instanceof` con pattern matching.
- Ejemplos de casting entre tipos.
- Interface sellada `Result`.
- Records `Success`, `Error` y `Adverticement` como variantes permitidas.
- Uso de `switch` para responder según el tipo concreto del resultado.

### `enumeraciones`

Práctica enfocada en `enum` y sus posibilidades dentro de Java. Incluye:

- Enum simple con `OrderStatus`.
- Enum con atributos y constructor privado con `Priority`.
- Enum con método de validación de rol con `UserRole`.
- Sobrescritura de `toString()` usando `switch expression`.
- Enum con método estático usando `Season`.
- Enum con métodos abstractos usando `Operation`.
- Enum que implementa una interfaz usando `DocumentType` y `Printable`.
- Uso de `name()`, `ordinal()`, `compareTo()`, `equals()` y comparación con `==`.

### `clasesSealed`

Prácticas con características modernas de Java:

- `records` para representar datos de forma compacta.
- Constructores compactos con validaciones.
- Métodos propios dentro de un `record`.
- Clases `sealed`, `final` y `non-sealed`.
- Jerarquía de vehículos controlada con `permits`.

## Cómo ejecutar los ejercicios

Cada carpeta funciona como un proyecto o conjunto de ejercicios independiente. Para probarlos:

1. Abre el repositorio en VS Code.
2. Entra a la carpeta del tema que quieras revisar.
3. Busca una clase con método `main`, normalmente dentro de `src`.
4. Ejecuta el archivo desde VS Code o desde terminal.

Ejemplo general:

```bash
cd herencia/src
javac test/Test.java
java test.Test
```

Ejemplo para el mini proyecto de biblioteca:

```bash
cd app_library/src
javac test/TestLibrary.java
java test.TestLibrary
```

Ejemplo para el sistema de notificaciones:

```bash
cd sistema_notificaciones/src
javac classes/*.java enums/*.java service/*.java test/TestNotifications.java
java test.TestNotifications
```

Ejemplo para generar Javadoc del sistema de notificaciones:

```bash
cd sistema_notificaciones/src
javadoc -d ../docs -encoding UTF-8 -charset UTF-8 classes/*.java enums/*.java service/*.java test/*.java
```

Ejemplo para abstracción e interfaces:

```bash
cd abstraccion/src
javac test/Test.java
java test.Test
```

Ejemplo para polimorfismo:

```bash
cd polimorfismo/src
javac test/Test.java
java test.Test
```

Ejemplo para enumeraciones:

```bash
cd enumeraciones/src
javac test/Test.java
java test.Test
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
- [x] Métodos de la clase `Arrays`
- [x] Encapsulamiento
- [x] Herencia y composición
- [x] Constructores con validaciones
- [x] Manejo de excepciones con `IllegalArgumentException`
- [x] Sobrescritura de métodos con `@Override`
- [x] Clases abstractas
- [x] Interfaces
- [x] Métodos `default`, `static` y `private` en interfaces
- [x] Polimorfismo
- [x] Pattern matching con `instanceof`
- [x] Clases `final`
- [x] `equals()`, `hashCode()` y `toString()`
- [x] Mini proyecto de biblioteca
- [x] Sistema de notificaciones empresariales
- [x] Records
- [x] Sealed classes
- [x] Enumeraciones (`enum`)
- [x] Enum con atributos, métodos, métodos abstractos e interfaces
- [x] Javadoc
- [ ] Proyecto final con Spring Boot

## Próxima etapa

Aplicar los fundamentos practicados en este repositorio dentro de un proyecto backend con **Spring Boot**, integrando buenas prácticas de programación orientada a objetos, estructura de capas y manejo de datos.

## Autor

**Emilio Caballero**  
Repositorio de aprendizaje para el camino por HITSS.
