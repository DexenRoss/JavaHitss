# Sistema de Notificaciones Empresariales

Mini proyecto en Java para representar y procesar distintos tipos de notificaciones empresariales usando características modernas de Java 21.

El programa trabaja con tres tipos de notificaciones:

- Correo electrónico
- SMS
- Push notification

Cada notificación se representa con un `record`, se valida desde su constructor compacto y se procesa usando una `sealed interface` junto con `switch` moderno con pattern matching.

## Objetivo del proyecto

El objetivo es practicar programación orientada a objetos y características modernas de Java, manteniendo el código simple, organizado y fácil de extender.

En este proyecto se trabajan los siguientes temas:

- `record`
- Constructores compactos
- Validaciones con `IllegalArgumentException`
- `sealed interface`
- `enum`
- Arreglos con `Notification[]`
- Switch moderno con pattern matching
- Separación por paquetes
- Generación de documentación con Javadoc

## Estructura del proyecto

```text
sistema_notificaciones/
├── README.md
└── src/
    ├── classes/
    │   ├── EmailNotification.java
    │   ├── Notification.java
    │   ├── PushNotification.java
    │   └── SmsNotification.java
    │
    ├── enums/
    │   └── NotificationType.java
    │
    ├── service/
    │   └── NotificationProcessor.java
    │
    └── test/
        └── TestNotifications.java
```

## Descripción de paquetes

| Paquete | Descripción |
|---|---|
| `classes` | Contiene la interfaz sellada `Notification` y los records de cada tipo de notificación. |
| `enums` | Contiene el enum `NotificationType`, usado para identificar el tipo de notificación. |
| `service` | Contiene la clase `NotificationProcessor`, encargada de procesar el arreglo y contar las notificaciones. |
| `test` | Contiene la clase `TestNotifications`, que ejecuta el programa y muestra el resultado final. |

## Funcionamiento general

El programa crea un arreglo de tipo `Notification[]` con objetos de distintos tipos:

```java
Notification[] notifications = {
    new EmailNotification("usuario@empresa.com", "Bienvenida", "Gracias por registrarte"),
    new SmsNotification("5512345678", "Tu codigo es 8271"),
    new PushNotification("abc123xyz987", "Tienes una nueva promocion")
};
```

Después, el arreglo se manda a `NotificationProcessor`, donde se recorre cada elemento y se identifica su tipo usando `switch` moderno:

```java
switch (notification) {
    case EmailNotification email -> emailCounter++;
    case SmsNotification sms -> smsCounter++;
    case PushNotification push -> pushCounter++;
}
```

Al final se muestra un resumen con la cantidad de correos, SMS y notificaciones Push procesadas.

## Validaciones

Cada `record` valida sus datos antes de crear el objeto.

| Record | Validación principal |
|---|---|
| `EmailNotification` | El correo debe tener un formato válido. |
| `SmsNotification` | El número telefónico debe tener exactamente 10 dígitos. |
| `PushNotification` | El token del dispositivo no puede ser nulo ni estar vacío. |

Si algún dato no cumple con las reglas, se lanza una `IllegalArgumentException`.

## Requisitos

Para compilar y ejecutar este proyecto se necesita:

- Java 21 o superior
- Git
- Terminal, PowerShell o consola de VS Code
- Opcional: VS Code con Extension Pack for Java

Para verificar la versión de Java instalada:

```bash
java --version
```

También se puede revisar el compilador con:

```bash
javac --version
```

## Descargar el repositorio

Para descargar el repo desde GitHub:

```bash
git clone https://github.com/DexenRoss/JavaHitss.git
```

Entrar al repositorio:

```bash
cd JavaHitss
```

Entrar al proyecto:

```bash
cd sistema_notificaciones
```

## Compilar el proyecto

Desde la carpeta `sistema_notificaciones`, ejecutar:

```bash
cd src
javac classes/*.java enums/*.java service/*.java test/TestNotifications.java
```

Esto compila todos los archivos necesarios del proyecto.

## Ejecutar el programa

Después de compilar, desde la carpeta `src`, ejecutar:

```bash
java test.TestNotifications
```

Salida esperada:

```text
========= RESUMEN =========
Correos enviados: 4
SMS enviados: 3
Push enviados: 5
Total: 12
```

## Generar documentación Javadoc

Desde la carpeta `sistema_notificaciones/src`, ejecutar:

```bash
javadoc -d ../docs -encoding UTF-8 -charset UTF-8 classes/*.java enums/*.java service/*.java test/*.java
```

Este comando genera la documentación en la carpeta:

```text
sistema_notificaciones/docs/
```

El archivo principal de la documentación es:

```text
sistema_notificaciones/docs/index.html
```

## Ver la documentación

Para revisar el Javadoc, abrir el archivo `index.html` en el navegador.

Desde Linux o WSL:

```bash
xdg-open ../docs/index.html
```

Desde Windows, estando en `sistema_notificaciones/src`:

```bash
explorer.exe ..\\docs\\index.html
```

También se puede abrir manualmente desde el explorador de archivos o con Live Server en VS Code.

## Notas sobre archivos generados

La carpeta `docs/` contiene documentación generada automáticamente, por lo que no es necesario escribirla a mano.

Si se desea mantener el repositorio limpio, se puede ignorar en `.gitignore`:

```gitignore
sistema_notificaciones/docs/
*.class
bin/
out/
```

## Autor

**Oscar Emilio Caballero Jimenez** (**DexenRoss**)

Proyecto realizado como práctica de Java para el Semillero de Talentos HITSS.
