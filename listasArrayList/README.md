# Listas y ArrayList

Proyecto de práctica enfocado en el uso de **listas** en Java, principalmente `List` y `ArrayList`.

También se agregan ejemplos de búsqueda con `Optional`, eliminación segura con `Iterator` y ordenamiento con `Comparable`, `Comparator`, `Collections.sort()` y `List.sort()`.

## Objetivo

Practicar el manejo de colecciones ordenadas, administración de productos y distintas formas de recorrer, buscar, modificar y ordenar elementos.

## Temas practicados

- Interfaz `List`
- Implementación `ArrayList`
- Métodos `add()`, `get()`, `set()`, `remove()` y `size()`
- Recorridos con `for`, `for-each` y `forEach()`
- Eliminación segura con `Iterator`
- Búsqueda con `Optional<Product>`
- Records con `Product`
- Administración de productos con `ProductManager`
- Implementación de `Comparable<Product>`
- Uso de `Comparator`
- Ordenamiento con `Collections.sort()`
- Ordenamiento con `List.sort()`

## Estructura del proyecto

```text
listasArrayList/
└── src/
    ├── models/
    │   └── Product.java
    │
    ├── services/
    │   └── ProductManager.java
    │
    └── test/
        ├── Test.java
        ├── TestIterator.java
        └── TestProduct.java
```

## Clases principales

| Clase | Responsabilidad |
|---|---|
| `Product` | Record que representa un producto con id, nombre y precio. |
| `ProductManager` | Administra una lista de productos. |
| `Test` | Practica operaciones básicas con `ArrayList`. |
| `TestIterator` | Muestra eliminación segura usando `Iterator`. |
| `TestProduct` | Prueba administración, búsqueda y ordenamiento de productos. |

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd listasArrayList/src
javac test/TestProduct.java
java test.TestProduct
```

También puedes ejecutar las prácticas básicas:

```bash
javac test/Test.java
java test.Test
```

```bash
javac test/TestIterator.java
java test.TestIterator
```

## Qué se aprende

Este módulo ayuda a entender cómo trabajar con colecciones dinámicas en Java y cómo ordenar objetos usando diferentes criterios.
