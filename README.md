# 🚀 Ejercicios de Programación Orientada a Objetos en Java  
### 📚 Con Arreglos, Strings y Matrices

> Colección de 10 ejercicios prácticos para reforzar **POO en Java**: encapsulamiento, arreglos, matrices, manejo de Strings, búsqueda y análisis de datos.  
> Recomendado usar **IntelliJ IDEA** y **Java 17+**.

---

## 🧭 Índice
- [1. Sistema de Estudiantes](#1️⃣-sistema-de-estudiantes)
- [2. Gestor de Libros](#2️⃣-gestor-de-libros)
- [3. Inventario de Productos](#3️⃣-inventario-de-productos)
- [4. Agenda de Contactos](#4️⃣-agenda-de-contactos)
- [5. Análisis de Texto](#5️⃣-análisis-de-texto)
- [6. Matriz de Temperaturas](#6️⃣-matriz-de-temperaturas)
- [7. Sistema de Calificaciones](#7️⃣-sistema-de-calificaciones)
- [8. Estadísticas de Palabras](#8️⃣-estadísticas-de-palabras)
- [9. Tablero de Juego (Tic-Tac-Toe)](#9️⃣-tablero-de-juego-tic-tac-toe)
- [10. Gestor de Cadenas](#🔟-gestor-de-cadenas)
- [⚙️ Tecnologías](#️-tecnologías)
- [▶️ Ejecución](#️-ejecución)
- [🗂️ Estructura sugerida](#️-estructura-sugerida)
- [🧩 Sugerencias de evaluación](#️-sugerencias-de-evaluación)

---

## 1️⃣ Sistema de Estudiantes
**Objetivo**  
Crear una clase `Estudiante` con `nombre`, `edad` y `notas[]` (arreglo de `double`).  
**Requisitos**  
- Calcular promedio y mostrar datos.  
- Registrar varios estudiantes (arreglo de objetos).  
- Mostrar estudiantes con promedio **> 8.0**.

**Hint de diseño (POO):** Encapsula atributos y expón métodos `get/set` y `calcularPromedio()`.

---

## 2️⃣ Gestor de Libros
**Objetivo**  
Clase `Libro` con `título`, `autor` (String) y `año`; usa un arreglo para almacenarlos.  
**Requisitos**  
- Búsqueda por **autor** o **palabra clave en el título**.  
- Mostrar libros **posteriores a 2010**.

**Sugerencia:** Implementa búsquedas **case-insensitive**.

---

## 3️⃣ Inventario de Productos
**Objetivo**  
Clase `Producto` con `nombre`, `código`, `cantidad`.  
**Requisitos**  
- Método para **añadir productos** al arreglo.  
- Método para **buscar por código**.  
- Listar productos con **stock < 5**.

**Tip:** Usa sobrecarga de constructores para inicialización flexible.

---

## 4️⃣ Agenda de Contactos
**Objetivo**  
Clase `Contacto` con `nombre`, `teléfono`, `correo`.  
**Requisitos**  
- Añadir, **buscar por nombre**, mostrar todos.  
- Buscar por **dominio del correo** (p. ej., `@gmail.com`).

**Valida:** formato básico del correo y evita duplicados por nombre.

---

## 5️⃣ Análisis de Texto
**Objetivo**  
Clase `AnalizadorTexto` que recibe un `String`.  
**Requisitos**  
- Contar palabras.  
- Contar ocurrencias de una palabra.  
- Reemplazar una palabra por otra.

**Detalle:** Normaliza con `toLowerCase()` y `trim()` para mejorar la precisión.

---

## 6️⃣ Matriz de Temperaturas
**Objetivo**  
Clase `Ciudad` con **matriz 7x4** (7 días × 4 semanas).  
**Requisitos**  
- **Promedio semanal**.  
- **Temperatura máxima** del mes.  
- **Día más frío** (día y semana).

**Nota:** Representa la matriz como `double[7][4]` y documenta índices (0..6, 0..3).

---

## 7️⃣ Sistema de Calificaciones
**Objetivo**  
Clase `Curso` con `nombre` y **matriz de notas** (`estudiantes × evaluaciones`).  
**Requisitos**  
- Promedio **por estudiante**.  
- Promedio **por evaluación**.  
- **Mejor rendimiento** (máximo promedio).

**Extra:** Devuelve también los índices/identificadores del estudiante/evaluación.

---

## 8️⃣ Estadísticas de Palabras
**Objetivo**  
Clase `EstadisticaTexto` con arreglo de `String`.  
**Requisitos**  
- Contar total de palabras.  
- Mostrar **palabras únicas**.  
- Palabra **más larga** y **más corta**.

**Sugerencia:** Usa un `Set<String>` interno para derivar únicas (aunque guardes arreglo).

---

## 9️⃣ Tablero de Juego (Tic-Tac-Toe)
**Objetivo**  
Clase `Tablero` con **matriz 3x3** de `char`.  
**Requisitos**  
- Colocar ficha, verificar **ganador**, mostrar tablero.  
- Clase `Jugador` (`nombre`, ficha `'X'`/`'O'`).

**Consejo:** Valida posiciones libres y detecta empates (tablero lleno y sin ganador).

---

## 🔟 Gestor de Cadenas
**Objetivo**  
Clase `Cadena` que contiene un `String`.  
**Requisitos**  
- Convertir a **mayúsculas/minúsculas**.  
- **Invertir** cadena.  
- Verificar si es **palíndromo**.  
- Contar **vocales y consonantes**.

**Tip:** Ignora espacios y acentos al validar palíndromos.

---

## ⚙️ Tecnologías
- **Java 17+**
- **IntelliJ IDEA** (recomendado)
- Estilo: **POO**, encapsulamiento, modularidad y manejo de errores con `IllegalArgumentException`.

---

## ▶️ Ejecución
Desde el IDE, crea una clase `Main` para cada ejercicio y ejecuta.  
Desde consola:
```bash
javac ruta/al/paquete/*.java
java paquete.Main
```

---

## 🗂️ Estructura sugerida
```
src/
 ├── estudiantes/        # Ej. 1
 ├── gestorlibros/       # Ej. 2
 ├── inventario/         # Ej. 3
 ├── agenda/             # Ej. 4
 ├── texttools/          # Ej. 5
 ├── clima/              # Ej. 6
 ├── calificaciones/     # Ej. 7
 ├── estadisticas/       # Ej. 8
 ├── tictactoe/          # Ej. 9
 └── cadenas/            # Ej.10
```

---

## 🧩 Sugerencias de evaluación
- ✔️ Encapsulamiento correcto (`private`, `get/set`).  
- ✔️ Validaciones (no nulos/negativos, rangos).  
- ✔️ Métodos bien nombrados y documentados.  
- ✔️ Uso adecuado de **arreglos/matrices**.  
- ✔️ Salidas claras en consola.  

> _“El buen código no solo funciona, también se entiende, se comparte y se mejora en equipo.”_

---

### 🗺️ Bonus: mini-plantillas de clase (copiar/pegar)

```java
// Esqueleto de clase con encapsulamiento
public class Modelo {
    private String atributo;

    public Modelo(String atributo) { setAtributo(atributo); }

    public String getAtributo() { return atributo; }

    public void setAtributo(String atributo) {
        if (atributo == null || atributo.isBlank())
            throw new IllegalArgumentException("Atributo inválido");
        this.atributo = atributo.trim();
    }
}
```

```java
// Lectura de datos con Scanner
Scanner sc = new Scanner(System.in);
System.out.print("Cantidad: ");
int n = Integer.parseInt(sc.nextLine());
```

> **Sugerencia:** crea una clase `ConsoleUtils` para centralizar lecturas y validaciones.
