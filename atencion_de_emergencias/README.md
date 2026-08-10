# Atención de Emergencias

Mini proyecto para practicar la atención de emergencias hospitalarias usando colecciones, servicios y comparadores.

El módulo representa casos de emergencia y permite ordenar o atender los casos según reglas de prioridad.

## Objetivo

Modelar un flujo básico de atención hospitalaria donde los casos no se atienden únicamente por orden de llegada, sino considerando su prioridad o urgencia.

## Temas practicados

- Records como modelo de datos
- Servicios para administrar casos
- Comparadores personalizados
- Priorización de elementos
- Colecciones aplicadas
- Separación por paquetes

## Estructura

```text
atencion_de_emergencias/
└── src/
    ├── App.java
    │
    ├── model/
    │   └── EmergencyCase.java
    │
    ├── service/
    │   └── EmergencyService.java
    │
    └── utils/
        └── EmergencyComparator.java
```

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd atencion_de_emergencias/src
javac App.java
java App
```

## Qué se aprende

Este proyecto muestra cómo aplicar comparadores y servicios para resolver un problema más realista: decidir el orden de atención de casos según prioridad.
