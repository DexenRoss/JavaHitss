# Citas Médicas

Mini proyecto para practicar la gestión de citas médicas usando colecciones, servicios y comparadores.

El sistema modela citas y permite trabajar con una lógica de atención organizada, reforzando estructuras de datos aplicadas a un caso realista.

## Objetivo

Aplicar colecciones y comparadores en un escenario de agenda o atención médica, donde las citas pueden ordenarse y administrarse desde una clase de servicio.

## Temas practicados

- Records como modelo de datos
- Servicios para administrar operaciones
- Comparadores personalizados
- Ordenamiento de citas
- Colecciones aplicadas
- Separación por paquetes

## Estructura

```text
citasMedicas/
└── src/
    ├── App.java
    │
    ├── models/
    │   └── Appointment.java
    │
    ├── services/
    │   └── AppointmentService.java
    │
    └── util/
        └── AppointmentComparator.java
```

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd citasMedicas/src
javac App.java
java App
```

## Qué se aprende

Este proyecto ayuda a entender cómo separar modelo, servicio y reglas de ordenamiento para administrar información de forma más estructurada.
