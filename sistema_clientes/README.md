# Sistema de Clientes

Mini proyecto para practicar el uso de **Map** aplicado a un sistema sencillo de clientes.

El proyecto organiza clientes por medio de claves, permitiendo registrar, consultar y administrar información de forma más directa que con listas simples.

## Objetivo

Aplicar mapas en un caso más cercano a una aplicación real: un sistema de clientes con modelo, servicio y clase principal de prueba.

## Temas practicados

- `Map`
- Búsqueda por clave
- Registro de clientes
- Actualización de información
- Separación por paquetes
- Uso de records como modelo de datos
- Servicio para concentrar operaciones

## Estructura

```text
sistema_clientes/
└── src/
    ├── App.java
    ├── TestMap.java
    │
    ├── model/
    │   └── Customer.java
    │
    └── services/
        └── CustomerService.java
```

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd sistema_clientes/src
javac App.java
java App
```

También se puede ejecutar la prueba de mapas:

```bash
javac TestMap.java
java TestMap
```

## Qué se aprende

Este proyecto refuerza cómo usar mapas para representar registros donde cada elemento puede encontrarse mediante una clave única.
