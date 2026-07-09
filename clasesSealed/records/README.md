# Records

Proyecto de práctica enfocado en el uso de **records** en Java.

Los `record` permiten modelar objetos de datos de forma compacta, generando automáticamente constructor, getters de estilo record, `equals()`, `hashCode()` y `toString()`.

## Objetivo

Practicar cómo declarar records, cómo validar datos con constructores compactos y cómo agregar métodos propios o métodos estáticos cuando el modelo lo necesita.

## Temas practicados

- Declaración de `record`
- Constructor compacto
- Validaciones con `IllegalArgumentException`
- Métodos propios dentro de un record
- Métodos estáticos
- Comparación con clases tradicionales
- Uso de `equals()` generado automáticamente
- Uso de `toString()` generado automáticamente
- Inmutabilidad de datos

## Estructura del proyecto

```text
clasesSealed/records/
└── src/
    ├── clases/
    │   └── Person.java
    │
    ├── records/
    │   ├── Employee.java
    │   ├── Person.java
    │   └── Rectangle.java
    │
    └── test/
        └── Test.java
```

## Records principales

| Record | Qué practica |
|---|---|
| `records.Person` | Declaración de un record con validaciones. |
| `Rectangle` | Métodos propios, cálculo de área y método estático `square()`. |
| `Employee` | Comparación entre una clase tradicional y un modelo tipo record. |

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd clasesSealed/records/src
javac test/Test.java
java test.Test
```

## Qué se aprende

Este módulo muestra cómo los `record` reducen código repetitivo cuando se quiere representar información simple, pero manteniendo la posibilidad de agregar validaciones y lógica propia.
