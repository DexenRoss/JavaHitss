# Gestión de Tickets

Mini proyecto en Java para practicar el uso de **`LinkedList`** mediante un sistema sencillo de gestión de tickets.

El proyecto permite agregar, obtener, insertar, eliminar y recorrer tickets usando operaciones propias de listas enlazadas.

## Objetivo

Practicar el manejo de `LinkedList`, `ListIterator`, records y enumeraciones dentro de un mini proyecto orientado a objetos.

## Temas practicados

- `LinkedList`
- Interfaz `List`
- `ListIterator`
- Recorrido hacia adelante
- Recorrido hacia atrás
- Inserción al inicio con `addFirst()`
- Inserción al final con `addLast()`
- Obtención del primer elemento con `getFirst()`
- Obtención del último elemento con `getLast()`
- Eliminación del primer elemento con `removeFirst()`
- Eliminación del último elemento con `removeLast()`
- Inserción por índice
- Records
- Enumeraciones (`enum`)

## Estructura del proyecto

```text
gestion_ticket/
└── src/
    ├── enums/
    │   └── Priority.java
    │
    ├── models/
    │   └── Ticket.java
    │
    ├── services/
    │   └── ManagerTicket.java
    │
    └── test/
        └── Test.java
```

## Clases principales

| Clase | Responsabilidad |
|---|---|
| `Priority` | Enum con las prioridades `LOW`, `MEDIUM`, `HIGH` y `CRITICAL`. |
| `Ticket` | Record que representa un ticket con id, título y prioridad. |
| `ManagerTicket` | Administra la lista enlazada de tickets. |
| `Test` | Ejecuta el flujo de prueba desde consola. |

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd gestion_ticket/src
javac test/Test.java
java test.Test
```

## Qué se aprende

Este proyecto muestra cuándo una `LinkedList` puede ser útil para trabajar con operaciones frecuentes al inicio y al final de una colección, además de practicar recorridos bidireccionales con `ListIterator`.
