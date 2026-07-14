# Archivos

Proyecto de práctica enfocado en la **lectura y escritura de archivos** en Java.

Este módulo muestra distintas formas de trabajar con archivos de texto usando clases de `java.io`, `java.nio.file` y `java.util`.

## Objetivo

Practicar cómo crear, escribir, leer y procesar archivos desde Java, manejando correctamente posibles errores de entrada/salida.

## Temas practicados

- Escritura de archivos con `FileWriter`
- Escritura eficiente con `BufferedWriter`
- Lectura con `Scanner`
- Lectura con `BufferedReader`
- Lectura con `Files.readString()`
- Lectura con `Files.lines()`
- Lectura con `Files.readAllLines()`
- Uso de `Path`
- Uso de `File`
- Manejo de `FileNotFoundException`
- Manejo de `IOException`
- Try-with-resources

## Estructura del proyecto

```text
archivos/
├── files/
│   ├── clientes.csv
│   ├── clientes.txt
│   ├── mensajes.txt
│   └── ventas.txt
│
└── src/
    └── test/
        ├── FileRead.java
        ├── FileReadLines.java
        ├── FilesBufferedReader.java
        ├── FilesReadAllLines.java
        ├── FilesScanner.java
        └── TestBufferedWriter.java
```

## Clases principales

| Clase | Qué practica |
|---|---|
| `TestBufferedWriter` | Escritura de texto usando `BufferedWriter`. |
| `FileRead` | Lectura completa con `Files.readString()`. |
| `FileReadLines` | Lectura como flujo de líneas con `Files.lines()`. |
| `FilesReadAllLines` | Lectura de todas las líneas como lista. |
| `FilesBufferedReader` | Lectura línea por línea con `BufferedReader`. |
| `FilesScanner` | Lectura de archivo usando `Scanner`. |

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
cd archivos
javac src/test/FileRead.java
java -cp src test.FileRead
```

Otro ejemplo:

```bash
cd archivos
javac src/test/FilesBufferedReader.java
java -cp src test.FilesBufferedReader
```

## Qué se aprende

Este módulo ayuda a comparar varias formas de leer archivos en Java y a entender cuándo conviene usar APIs modernas como `Files` y `Path` frente a clases clásicas como `FileReader`, `BufferedReader` o `Scanner`.
