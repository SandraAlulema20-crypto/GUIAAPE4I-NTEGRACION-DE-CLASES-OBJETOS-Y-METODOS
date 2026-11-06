# GUIAAPE4I-NTEGRACION-DE-CLASES-OBJETOS-Y-METODOS
EJERCICIOSPROPUESTOS
# APE 4: Integración de clases, objetos y métodos (Java)

Ejercicios de práctica en Java sobre clases, objetos y métodos, desarrollados para la asignatura **Algoritmos y Lógica de Programación**.

## Datos académicos

| | |
|---|---|
| **Universidad** | Universidad Técnica de Ambato (UTA) |
| **Facultad** | Ingeniería en Sistemas, Electrónica e Industrial (FISEI) |
| **Carrera** | Ingeniería en Software |
| **Nivel / Paralelo** | Primer semestre, paralelo B |
| **Asignatura** | Algoritmos y Lógica de Programación |
| **Docente** | Ing. José Rubén Caiza Caizabuano |
| **Actividad** | SW-AyLP-APE-04: Clases, Objetos y Métodos |
| **Estudiante** | Sandra Jazmin Alulema Chato |

## Objetivo

Desarrollar programas utilizando clases, objetos y métodos, lo cual permite disminuir errores y reutilizar el código.

## Ejercicios

| N.º | Ejercicio | Concepto que se practica |
|:---:|---|---|
| 1 | Libro y Autor | Objeto como atributo |
| 2 | Rectángulo | Firmas de métodos y tipos de retorno |
| 3 | Producto y Venta | Objeto como parámetro |
| 4 | Transferencias | Objeto como parámetro (`Cuenta`) |
| 5 | Biblioteca | Colaboración entre clases (`Usuario`, `Libro`, `Prestamo`) |

## Estructura del proyecto

Cada ejercicio está en su propio paquete, porque los ejercicios 1 y 5 tienen cada uno su clase `Libro`.

```
.
├── README.md
└── src
    ├── ejercicio1
    │   ├── Autor.java
    │   ├── Libro.java
    │   └── Main.java
    ├── ejercicio2
    │   ├── Rectangulo.java
    │   └── Main.java
    ├── ejercicio3
    │   ├── Producto.java
    │   ├── Venta.java
    │   └── Main.java
    ├── ejercicio4
    │   ├── Cuenta.java
    │   └── Main.java
    └── ejercicio5
        ├── Usuario.java
        ├── Libro.java
        ├── Prestamo.java
        └── Main.java
```

## Requisitos

- JDK 17 o superior (se verifica con `java -version` y `javac -version`)
- Visual Studio Code con la extensión **Extension Pack for Java** (opcional)

## Cómo ejecutar

### Con Visual Studio Code

1. Abrir la carpeta del proyecto con **Archivo > Abrir carpeta**.
2. Abrir el `Main.java` del ejercicio que se quiere probar.
3. Pulsar **Run**, que aparece sobre `public static void main`.

### Con la terminal

Desde la carpeta `src`, se compila y se ejecuta cada ejercicio por separado. Por ejemplo, el ejercicio 1:

```bash
cd src
javac ejercicio1/*.java
java ejercicio1.Main
```

Para otro ejercicio se cambia el número (`ejercicio2`, `ejercicio3`, etc.).

## Clonar el repositorio

```bash
git clone https://github.com/<usuario>/<repositorio>.git
cd <repositorio>
```

Reemplaza `<usuario>` y `<repositorio>` por los de tu cuenta de GitHub.
