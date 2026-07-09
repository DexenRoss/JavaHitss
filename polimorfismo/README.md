# Polimorfismo

Proyecto de práctica enfocado en **polimorfismo**, casting, pattern matching con `instanceof`, records e interfaces selladas.

Este módulo muestra cómo una referencia de tipo general puede apuntar a objetos de clases concretas diferentes y ejecutar el comportamiento correspondiente.

## Objetivo

Practicar el uso de referencias polimórficas y modelar distintos resultados posibles usando una `sealed interface` junto con `record` y `switch` moderno.

## Temas practicados

- Polimorfismo
- Clases abstractas
- Sobrescritura de métodos
- Referencias de tipo padre apuntando a objetos hijo
- Casting
- `instanceof`
- Pattern matching con `instanceof`
- `sealed interface`
- `record`
- Switch moderno con pattern matching

## Estructura del proyecto

```text
polimorfismo/
└── src/
    ├── classes/
    │   ├── Employee.java
    │   ├── Developer.java
    │   └── Manager.java
    │
    ├── interfaces/
    │   ├── Result.java
    │   ├── Success.java
    │   ├── Error.java
    │   └── Adverticement.java
    │
    └── test/
        └── Test.java
```

## Clases e interfaces principales

| Elemento | Responsabilidad |
|---|---|
| `Employee` | Clase abstracta que define el contrato de trabajo y salario. |
| `Developer` | Implementación concreta de un empleado desarrollador. |
| `Manager` | Implementación concreta de un empleado gerente. |
| `Result` | Interface sellada para modelar resultados posibles. |
| `Success` | Record que representa una operación exitosa. |
| `Error` | Record que representa un error. |
| `Adverticement` | Record que representa un aviso o advertencia. |

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd polimorfismo/src
javac test/Test.java
java test.Test
```

## Qué se aprende

Este módulo ayuda a entender cómo Java decide qué método ejecutar según el objeto real en memoria y cómo las características modernas del lenguaje permiten modelar casos cerrados de forma más segura.
