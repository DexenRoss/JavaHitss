# Abstracción

Proyecto de práctica enfocado en **clases abstractas**, métodos abstractos, métodos concretos e interfaces en Java.

Este módulo trabaja ejemplos con vehículos, figuras geométricas e interfaces para separar contratos de implementación.

## Objetivo

Comprender cómo usar clases abstractas e interfaces para definir comportamientos generales y permitir que cada clase concreta implemente su propia versión.

## Temas practicados

- Clases abstractas
- Métodos abstractos
- Métodos concretos dentro de clases abstractas
- Polimorfismo
- Interfaces
- Implementación de interfaces con `implements`
- Métodos `default` en interfaces
- Métodos `static` en interfaces
- Métodos `private` en interfaces
- Sobrescritura con `@Override`

## Clases e interfaces principales

```text
abstraccion/
└── src/
    ├── clases/
    │   ├── Vehicle.java
    │   ├── Car.java
    │   ├── Shape.java
    │   ├── Circle.java
    │   └── Square.java
    │
    ├── interfaces/
    │   ├── Flyable.java
    │   ├── Bird.java
    │   └── Printer.java
    │
    └── test/
        └── Test.java
```

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd abstraccion/src
javac test/Test.java
java test.Test
```

## Qué se aprende

Este módulo ayuda a entender cuándo conviene usar una clase abstracta y cuándo una interfaz. También muestra cómo Java permite combinar métodos obligatorios, métodos ya implementados y comportamiento polimórfico.
