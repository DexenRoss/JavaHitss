# Enumeraciones

Proyecto de práctica enfocado en el uso de **enumeraciones (`enum`)** en Java.

Este módulo muestra que un `enum` no solo sirve para declarar constantes, sino que también puede tener atributos, constructores, métodos, sobrescritura de métodos e incluso implementar interfaces.

## Objetivo

Entender cómo usar `enum` para representar conjuntos cerrados de valores de forma segura y expresiva.

## Temas practicados

- Declaración de `enum`
- Constantes enumeradas
- Atributos dentro de un enum
- Constructor privado en enum
- Métodos personalizados
- Métodos estáticos
- Métodos abstractos en enum
- Sobrescritura de `toString()`
- Implementación de interfaces
- Uso de `name()`
- Uso de `ordinal()`
- Uso de `compareTo()`
- Comparación con `equals()` y `==`
- `switch expression` con enum

## Estructura del proyecto

```text
enumeraciones/
└── src/
    ├── enums/
    │   ├── DocumentType.java
    │   ├── Operation.java
    │   ├── OrderStatus.java
    │   ├── Priority.java
    │   ├── Season.java
    │   └── UserRole.java
    │
    ├── interfaces/
    │   └── Printable.java
    │
    └── test/
        └── Test.java
```

## Enumeraciones principales

| Enum | Qué representa |
|---|---|
| `OrderStatus` | Estados básicos de una orden. |
| `Priority` | Prioridades con descripción interna. |
| `UserRole` | Roles de usuario con método de validación. |
| `Season` | Estaciones del año con método estático. |
| `Operation` | Operaciones con métodos abstractos por constante. |
| `DocumentType` | Tipos de documento que implementan `Printable`. |

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd enumeraciones/src
javac test/Test.java
java test.Test
```

## Qué se aprende

Este módulo ayuda a ver los `enum` como tipos completos de Java, útiles para representar estados, roles, operaciones y comportamientos controlados sin depender de cadenas o números sueltos.
