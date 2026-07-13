# Herencia

Proyecto de práctica enfocado en **herencia**, composición y sobrescritura de métodos en Java.

El módulo modela una jerarquía de personas y empleados para practicar cómo una clase padre puede compartir atributos y comportamientos con clases hijas.

## Objetivo

Entender cómo reutilizar código mediante herencia, cómo especializar clases hijas y cómo sobrescribir métodos para adaptar el comportamiento de cada tipo de objeto.

## Temas practicados

- Clases padre e hijas
- Herencia con `extends`
- Composición
- Constructores
- Validaciones con excepciones
- Sobrescritura de métodos con `@Override`
- Cálculo de bonos
- Métodos polimórficos como `showInformation()`
- Uso de paquetes para organizar el código

## Clases principales

```text
herencia/
└── src/
    ├── padre/
    │   ├── Person.java
    │   └── Employee.java
    │
    ├── hijas/
    │   ├── Administrative.java
    │   ├── Sales.java
    │   └── Teacher.java
    │
    └── test/
        └── Test.java
```

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd herencia/src
javac test/Test.java
java test.Test
```

## Qué se aprende

Este módulo muestra cómo construir jerarquías de clases, reutilizar atributos y métodos comunes, y especializar comportamientos según el tipo de empleado.
