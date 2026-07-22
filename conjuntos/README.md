# Conjuntos

Proyecto de práctica enfocado en el uso de **conjuntos (`Set`)** en Java.

Este módulo muestra cómo almacenar valores únicos usando la interfaz `Set` y la implementación `HashSet`.

## Objetivo

Entender cómo funcionan los conjuntos en Java y cómo evitan elementos duplicados de forma automática.

## Temas practicados

- Interfaz `Set`
- Implementación `HashSet`
- Inserción de elementos con `add()`
- Valor booleano que devuelve `add()`
- Elementos únicos
- Impresión de colecciones

## Estructura del proyecto

```text
conjuntos/
└── src/
    └── test/
        └── App.java
```

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd conjuntos/src
javac test/App.java
java test.App
```

## Qué se aprende

Este módulo ayuda a entender que un `Set` no guarda elementos repetidos. Si se intenta agregar un valor que ya existe, el conjunto lo ignora y `add()` devuelve `false`.
