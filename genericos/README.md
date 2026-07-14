# Genéricos

Proyecto de práctica enfocado en el uso de **genéricos** en Java.

Este módulo muestra cómo crear clases, métodos, constructores, interfaces y records genéricos para trabajar con distintos tipos de datos sin perder seguridad de tipos.

## Objetivo

Entender cómo usar parámetros de tipo como `<T>`, `<K, V>` y `<T, E>` para escribir código reutilizable y flexible.

## Temas practicados

- Clases genéricas
- Métodos genéricos
- Constructores genéricos
- Interfaces genéricas
- Implementaciones con tipos concretos
- Pares clave-valor
- Respuestas con datos y error
- Records genéricos
- Uso de `Optional`
- Uso de `orElse()`
- Uso de `orElseThrow()`
- Uso de `ifPresent()`

## Estructura del proyecto

```text
genericos/
└── src/
    ├── classes/
    │   ├── Employee.java
    │   └── Product.java
    │
    ├── genericos/
    │   ├── Box.java
    │   ├── Pair.java
    │   ├── Printer.java
    │   ├── Response.java
    │   ├── Util.java
    │   └── interfaces/
    │       ├── Repository.java
    │       └── implementations/
    │           └── EmployeeRepository.java
    │
    ├── optionals/
    │   └── TestOptional.java
    │
    ├── records/
    │   └── Result.java
    │
    └── test/
        ├── Test.java
        ├── TestConstructor.java
        ├── TestPair.java
        ├── TestRecord.java
        └── TestUtil.java
```

## Clases principales

| Clase | Qué practica |
|---|---|
| `Box<T>` | Clase genérica con getter, setter, constructor y método genérico. |
| `Pair<K, V>` | Estructura genérica de clave y valor. |
| `Response<T, E>` | Respuesta genérica con dato y error. |
| `Util` | Métodos genéricos estáticos. |
| `Repository<T>` | Interface genérica para guardar y buscar entidades. |
| `Result<T>` | Record genérico para envolver un valor. |
| `TestOptional` | Uso de `Optional` para manejar valores posiblemente nulos. |

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd genericos/src
javac test/Test.java
java test.Test
```

Para probar `Optional`:

```bash
cd genericos/src
javac optionals/TestOptional.java
java optionals.TestOptional
```

Para probar el record genérico:

```bash
cd genericos/src
javac test/TestRecord.java
java test.TestRecord
```

## Qué se aprende

Este módulo ayuda a entender cómo Java permite escribir código reutilizable para diferentes tipos de datos sin tener que duplicar clases o sacrificar seguridad de tipos.
