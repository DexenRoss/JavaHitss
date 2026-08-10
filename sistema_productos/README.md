# Sistema de Productos

Mini proyecto para practicar colecciones aplicadas a productos, historial de acceso y estructuras ordenadas.

Este módulo junta varios conceptos de colecciones en Java para administrar productos y conservar información sobre su uso o consulta.

## Objetivo

Practicar estructuras como `LinkedHashSet`, `TreeMap` y servicios de historial usando modelos de productos.

## Temas practicados

- Records y clases tradicionales
- Registro de productos
- Historial de productos
- `LinkedHashSet`
- `TreeMap`
- Servicios para encapsular lógica
- Historial tipo LRU
- Ordenamiento y recorrido de colecciones

## Estructura

```text
sistema_productos/
├── productos_favoritos/
│   └── src/App.java
│
└── src/
    ├── models/
    │   ├── Product.java
    │   └── ProductTraditional.java
    │
    ├── services/
    │   ├── ProductHistoryAccesOrderService.java
    │   ├── ProductHistoryLRU.java
    │   ├── ProductHistoryService.java
    │   └── ProductRegistry.java
    │
    └── test/
        ├── App.java
        ├── TestHistoryProduct.java
        ├── TestLinkedHashSet.java
        ├── TestRLU.java
        └── TestTreeMap.java
```

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd sistema_productos/src
javac test/App.java
java test.App
```

También se pueden ejecutar pruebas específicas:

```bash
javac test/TestTreeMap.java
java test.TestTreeMap
```

```bash
javac test/TestLinkedHashSet.java
java test.TestLinkedHashSet
```

## Qué se aprende

Este proyecto muestra cómo elegir distintas colecciones dependiendo del comportamiento necesario: evitar duplicados, conservar orden, ordenar por clave o simular historial de acceso.
