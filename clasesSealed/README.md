# Clases Sealed y Records

Proyecto de práctica enfocado en características modernas de Java: **sealed classes** y **records**.

Este módulo sirve para practicar cómo limitar jerarquías de clases y cómo representar datos de forma más compacta.

## Objetivo

Entender cómo funcionan las clases selladas (`sealed`, `permits`, `final`, `non-sealed`) y cómo los `record` permiten declarar estructuras de datos inmutables con menos código repetitivo.

## Temas practicados

- `sealed class`
- `permits`
- Clases `final`
- Clases `non-sealed`
- Jerarquías controladas
- `record`
- Constructores compactos
- Validaciones dentro de records
- Métodos propios dentro de records
- Métodos estáticos dentro de records
- Comparación entre clases tradicionales y records

## Estructura general

```text
clasesSealed/
├── records/
│   └── Prácticas con record y comparación contra clases tradicionales.
│
└── src/
    ├── sealed/
    │   ├── Vehiculo.java
    │   ├── Automovil.java
    │   ├── Motocicleta.java
    │   ├── Camion.java
    │   └── Deportiva.java
    │
    ├── subclases/
    │   ├── Persona.java
    │   └── Tractocamion.java
    │
    └── test/
        └── Test.java
```

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd clasesSealed/src
javac test/Test.java
java test.Test
```

## Qué se aprende

Este módulo ayuda a entender cómo Java permite controlar qué clases pueden heredar de una clase base, evitando jerarquías abiertas cuando el dominio necesita reglas más estrictas.
