# Excepciones

Proyecto de práctica enfocado en el **manejo de excepciones** en Java.

Este módulo muestra cómo crear excepciones personalizadas, cómo lanzarlas y cómo capturarlas para controlar errores de forma clara.

## Objetivo

Entender la diferencia entre excepciones checked y unchecked, además de practicar `throw`, `throws` y bloques `try-catch`.

## Temas practicados

- Excepciones checked
- Excepciones unchecked
- `Exception`
- `RuntimeException`
- Excepciones personalizadas
- `throw`
- `throws`
- Bloques `try-catch`
- Validaciones de datos
- Flujo del programa después de una excepción

## Estructura del proyecto

```text
excepciones/
└── src/
    ├── excepciones/
    │   └── InsufficientStockException.java
    │
    └── test/
        ├── InvalidOrderException.java
        └── TestExceptionNew.java
```

## Clases principales

| Clase | Qué practica |
|---|---|
| `InsufficientStockException` | Excepción checked para representar falta de stock. |
| `InvalidOrderException` | Excepción unchecked para representar una orden inválida. |
| `TestExceptionNew` | Prueba de validaciones, lanzamiento y captura de excepciones. |

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd excepciones/src
javac test/TestExceptionNew.java
java test.TestExceptionNew
```

## Qué se aprende

Este módulo ayuda a entender cómo Java separa los errores que deben declararse obligatoriamente de los errores de ejecución, y cómo usar excepciones personalizadas para que el código comunique mejor los problemas del dominio.
