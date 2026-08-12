# Productos Favoritos

Mini proyecto para practicar colecciones aplicadas a una lista de productos favoritos.

El módulo usa un modelo y un servicio para administrar productos favoritos, evitando duplicados y concentrando la lógica en una clase de servicio.

## Objetivo

Aplicar colecciones en un caso sencillo donde se requiere registrar, consultar y mostrar productos favoritos.

## Temas practicados

- Colecciones en Java
- Manejo de productos favoritos
- Separación entre modelo, servicio y prueba
- Uso de records como modelos
- Operaciones de alta, consulta y recorrido

## Estructura

```text
productos_favoritos/
└── src/
    ├── models/
    │   └── FavoriteProducts.java
    │
    ├── services/
    │   └── FavoriteProductService.java
    │
    └── test/
        └── App.java
```

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd productos_favoritos/src
javac test/App.java
java test.App
```

## Qué se aprende

Este proyecto ayuda a practicar cómo encapsular operaciones sobre colecciones dentro de servicios, acercando los ejercicios a una estructura más parecida a una aplicación real.
