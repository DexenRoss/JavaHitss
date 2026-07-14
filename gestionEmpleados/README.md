# Gestión de Empleados

Mini proyecto en Java para practicar una estructura sencilla tipo **Repository + Service** usando genéricos y `Optional`.

El proyecto simula la búsqueda de empleados en un arreglo y muestra cómo manejar resultados presentes o ausentes sin depender directamente de `null`.

## Objetivo

Practicar una separación básica de responsabilidades entre modelo, repositorio, servicio y clase de prueba.

## Temas practicados

- `record`
- Genéricos
- Interface genérica `Repository<T, ID>`
- Implementación concreta de repositorio
- Capa de servicio
- Inyección de dependencia por constructor
- `Optional`
- `Optional.empty()`
- `Optional.of()`
- `map()`
- `ifPresent()`
- `orElse()`
- Arreglos de objetos

## Estructura del proyecto

```text
gestionEmpleados/
└── src/
    ├── models/
    │   └── Employee.java
    │
    ├── repositories/
    │   ├── Repository.java
    │   └── impl/
    │       ├── EmployeeRepositoryImpl.java
    │       └── EmployeeServiceImpl.java
    │
    ├── services/
    │   └── EmployeeService.java
    │
    └── test/
        └── TestEmployee.java
```

## Componentes principales

| Elemento | Responsabilidad |
|---|---|
| `Employee` | Modelo de empleado usando `record`. |
| `Repository<T, ID>` | Contrato genérico para buscar por identificador. |
| `EmployeeRepositoryImpl` | Repositorio con arreglo interno de empleados. |
| `EmployeeService` | Contrato de servicio para buscar empleados y nombres. |
| `EmployeeServiceImpl` | Implementación que usa el repositorio y transforma resultados con `Optional`. |
| `TestEmployee` | Clase de prueba del flujo principal. |

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd gestionEmpleados/src
javac test/TestEmployee.java
java test.TestEmployee
```

## Qué se aprende

Este proyecto conecta genéricos, records y `Optional` en una estructura más cercana a una aplicación real, donde el repositorio se encarga de obtener datos y el servicio de exponer operaciones de negocio.
