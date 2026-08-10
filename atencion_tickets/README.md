# Atención de Tickets

Mini proyecto para practicar atención de tickets usando colas en Java.

Este módulo modela tickets de soporte y los atiende mediante estructuras como `Queue` y `PriorityQueue`, útiles cuando el orden de atención importa.

## Objetivo

Entender cómo usar colas para procesar elementos en orden y cómo una cola con prioridad puede cambiar el orden de atención según la urgencia de cada ticket.

## Temas practicados

- `Queue`
- `PriorityQueue`
- Atención FIFO
- Atención por prioridad
- Records como modelo de datos
- Servicios para encapsular operaciones
- Comparación y ordenamiento de elementos

## Estructura

```text
atencion_tickets/
└── src/
    ├── App.java
    ├── TestPriorityQueue.java
    │
    ├── models/
    │   └── SupportTicket.java
    │
    └── services/
        └── TicketService.java
```

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd atencion_tickets/src
javac App.java
java App
```

También se puede ejecutar la prueba de prioridad:

```bash
javac TestPriorityQueue.java
java TestPriorityQueue
```

## Qué se aprende

Este proyecto muestra cómo las colas permiten modelar procesos de atención, turnos y prioridades, algo común en sistemas de soporte o atención al cliente.
