# JavaHitss

Repositorio de práctica para el **Semillero de Talentos HITSS**, enfocado en reforzar fundamentos de Java mediante ejercicios, mini proyectos y prácticas organizadas por tema.

## Objetivo

Este repositorio documenta mi avance en Java desde los fundamentos del lenguaje hasta conceptos de programación orientada a objetos y características modernas del ecosistema Java.

A lo largo del repositorio se trabajan temas como variables, operadores, entrada de datos, condicionales, ciclos, arreglos, matrices, encapsulamiento, herencia, composición, validaciones, manejo de excepciones, sobrescritura de métodos, clases `final`, `records` y clases `sealed`.

La meta del camino es consolidar estos fundamentos para después aplicarlos en un proyecto backend con **Spring Boot**.

## Tecnologías usadas

- Java
- Java 14+ para prácticas con `switch` expression
- Java 17+ para prácticas con `records` y `sealed classes`
- VS Code
- Git y GitHub

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
├── app_library/
│   └── Mini proyecto de biblioteca con Book, Library e ISBN.
│       Practica arreglos dinámicos, búsqueda, eliminación, validación,
│       clases final, equals, hashCode y toString.
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
| `app_library` | Mini proyecto de biblioteca | Modelo `Book`, clase `Library`, clase `ISBN`, validaciones, búsqueda, eliminación, conteo de autores, ISBN únicos, `equals`, `hashCode` y `toString`. |
| `clasesSealed/records` | Records | Declaración de `record`, constructor compacto, validaciones, métodos propios, métodos estáticos y comparación con clases normales. |
| `clasesSealed/sealed` | Sealed classes | Jerarquías controladas con `sealed`, `permits`, `final` y `non-sealed`. |
| `Spring Boot` | Siguiente etapa | Desarrollo de un proyecto backend aplicando los fundamentos aprendidos durante el semillero. |

## Mini proyectos destacados

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

> Nota: algunas carpetas fueron creadas como proyectos Java de VS Code, por lo que pueden incluir carpetas como `bin`, `.vscode` o archivos generados por el entorno.

## Requisitos sugeridos

Para la mayoría de ejercicios basta con tener Java instalado. Para las prácticas más recientes se recomienda:

- Java 14 o superior para `switch expression`.
- Java 17 o superior para `records` y `sealed classes`.
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
- [x] Clases `final`
- [x] `equals()`, `hashCode()` y `toString()`
- [x] Mini proyecto de biblioteca
- [x] Records
- [x] Sealed classes
- [ ] Proyecto final con Spring Boot

## Autor

**Emilio Caballero**  
Repositorio de aprendizaje para el camino por HITSS.
