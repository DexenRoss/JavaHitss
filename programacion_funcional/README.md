# Programación Funcional

Proyecto de práctica enfocado en **programación funcional en Java**.

Este módulo introduce lambdas, interfaces funcionales, reglas de negocio expresadas como funciones y primeros ejercicios con streams.

## Objetivo

Entender cómo Java permite trabajar con funciones como comportamiento, simplificar código con lambdas y aplicar operaciones sobre colecciones de forma declarativa.

## Temas practicados

- Lambdas
- Interfaces funcionales
- Métodos de referencia
- Reglas de negocio con interfaces
- Records como modelos de datos
- Primeros ejercicios con streams
- Separación por paquetes

## Estructura

```text
programacion_funcional/
└── src/
    ├── App.java
    ├── TestFuncional.java
    ├── TestInterface.java
    ├── TestStream.java
    │
    ├── interfaces/
    │   └── ProductRule.java
    │
    └── models/
        ├── Employee.java
        └── Product.java
```

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd programacion_funcional/src
javac App.java
java App
```

También se pueden ejecutar las clases de prueba:

```bash
javac TestFuncional.java
java TestFuncional
```

```bash
javac TestInterface.java
java TestInterface
```

## Qué se aprende

Este módulo ayuda a entender cómo representar comportamiento con lambdas e interfaces funcionales, dejando la base para trabajar después con streams y procesamiento de colecciones.
