package estudiantes;

public class Estudiante {
    private String nombre;
    private int edad;
    private double[] notas; // arreglo de notas

    // Constructor
    public Estudiante(String nombre, int edad, double[] notas) {
        setNombre(nombre);
        setEdad(edad);
        this.notas = notas;
    }

    // Getters y Setters con validación
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("❌ El nombre no puede estar vacío.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("❌ La edad debe ser mayor a 0.");
        }
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    // Método para calcular promedio
    public double calcularPromedio() {
        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.length;
    }

    // Mostrar datos del estudiante
    public String mostrarDatos() {
        return "Estudiante: " + nombre +
                " | Edad: " + edad +
                " | Promedio: " + String.format("%.2f", calcularPromedio());
    }
}
