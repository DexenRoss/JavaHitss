# Payment

Proyecto de práctica enfocado en polimorfismo aplicado a métodos de pago.

El módulo modela distintos tipos de pago y permite practicar una jerarquía donde varias clases comparten un contrato común, pero cada una implementa su propio comportamiento.

## Objetivo

Aplicar programación orientada a objetos para representar pagos con efectivo, tarjeta y PayPal, reforzando herencia, sobrescritura y polimorfismo.

## Temas practicados

- Herencia
- Polimorfismo
- Sobrescritura de métodos
- Clases base y clases concretas
- Validaciones básicas
- Métodos comunes para distintos tipos de pago

## Estructura

```text
payment/
└── src/
    ├── classes/
    │   ├── Payment.java
    │   ├── CashPayment.java
    │   ├── CreditCardPayment.java
    │   └── PaypalPayment.java
    │
    └── test/
        └── Test.java
```

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd payment/src
javac test/Test.java
java test.Test
```

## Qué se aprende

Este proyecto muestra cómo trabajar con varias implementaciones de un mismo concepto, permitiendo tratar diferentes formas de pago de manera uniforme mediante polimorfismo.
