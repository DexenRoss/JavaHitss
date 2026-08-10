# Estadísticas de Productos

Mini proyecto para practicar el uso de mapas y servicios calculando estadísticas de productos.

El módulo trabaja con modelos y servicios para registrar información, contar datos y generar resultados derivados a partir de colecciones.

## Objetivo

Aplicar `Map` y servicios en un escenario de estadísticas, reforzando cómo agrupar, contar y consultar información de productos.

## Temas practicados

- `Map`
- Conteo de información
- Acumulación de estadísticas
- Separación por modelo y servicios
- Uso de `LinkedHashMap` para conservar orden de inserción
- Recorrido de estructuras clave-valor

## Estructura

```text
estadisticas_productos/
└── src/
    ├── App.java
    ├── TestLinkedHashMap.java
    │
    ├── model/
    │   └── ProductStadistics.java
    │
    └── services/
        ├── SalesProductStadisticService.java
        └── SalesStadisticService.java
```

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd estadisticas_productos/src
javac App.java
java App
```

También se puede ejecutar la práctica de `LinkedHashMap`:

```bash
javac TestLinkedHashMap.java
java TestLinkedHashMap
```

## Qué se aprende

Este proyecto ayuda a entender cómo usar mapas para transformar datos en información útil, como conteos, estadísticas y acumulados.
