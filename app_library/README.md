# App Library

Mini proyecto en Java que simula una biblioteca básica usando programación orientada a objetos.

El proyecto permite practicar cómo modelar entidades, validar datos y manejar una colección de objetos usando arreglos.

## Objetivo

Construir una pequeña aplicación de consola para administrar libros, reforzando conceptos como encapsulamiento, clases `final`, arreglos dinámicos y sobrescritura de métodos heredados de `Object`.

## Temas practicados

- Programación orientada a objetos
- Encapsulamiento
- Clases `final`
- Validaciones con `IllegalArgumentException`
- Arreglos de objetos
- Crecimiento dinámico con `Arrays.copyOf()`
- Búsqueda de objetos
- Eliminación de elementos
- Conteo de autores únicos
- Obtención de ISBN únicos
- Sobrescritura de `equals()`
- Sobrescritura de `hashCode()`
- Sobrescritura de `toString()`

## Estructura del proyecto

```text
app_library/
└── src/
    ├── clasefinal/
    │   └── ISBN.java
    │
    ├── clases/
    │   ├── Book.java
    │   └── Library.java
    │
    └── test/
        └── TestLibrary.java
```

## Clases principales

| Clase | Responsabilidad |
|---|---|
| `ISBN` | Representa y valida el identificador de un libro. |
| `Book` | Modela un libro con ISBN, título y autor. |
| `Library` | Administra el arreglo de libros y sus operaciones. |
| `TestLibrary` | Ejecuta pruebas del proyecto desde consola. |

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd app_library/src
javac test/TestLibrary.java
java test.TestLibrary
```

## Qué se aprende

Este mini proyecto conecta varios fundamentos de Java en un caso más cercano a una aplicación real: crear entidades, validarlas, almacenarlas y realizar operaciones sobre ellas.
