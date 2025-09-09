import java.util.Scanner;

public class Curso {
    private String nombre;
    private double[][] notas;
    private String[] estudiantes;

    public Curso(String nombre, int cantEstudiantes, int cantEvaluaciones) {
        this.nombre = nombre;
        this.notas = new double[cantEstudiantes][cantEvaluaciones];
        this.estudiantes = new String[cantEstudiantes];
    }

    public void cargarDatosDesdeUsuario(Scanner sc) {
        System.out.println("\n=== Carga de estudiantes y notas para " + nombre + " ===");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = sc.nextLine().trim();

            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = leerNotaValida(sc, "  Nota de la evaluación " + (j + 1) + " (0-100): ");
            }
        }
    }

    private double leerNotaValida(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = sc.nextLine().trim();
            try {
                double n = Double.parseDouble(entrada);
                if (n < 0 || n > 100) {
                    System.out.println("  -> La nota debe estar entre 0 y 100. Intenta de nuevo.");
                } else {
                    return n;
                }
            } catch (NumberFormatException e) {
                System.out.println("  -> Ingresa un número válido. Ej: 87.5");
            }
        }
    }

    public double promedioPorEstudiante(int idxEstudiante) {
        double suma = 0;
        for (double n : notas[idxEstudiante]) suma += n;
        return suma / notas[idxEstudiante].length;
    }

    public double promedioPorEvaluacion(int idxEvaluacion) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) suma += notas[i][idxEvaluacion];
        return suma / notas.length;
    }

    public String estudianteConMejorRendimiento() {
        int mejorIdx = 0;
        double mejorProm = promedioPorEstudiante(0);
        for (int i = 1; i < notas.length; i++) {
            double p = promedioPorEstudiante(i);
            if (p > mejorProm) {
                mejorProm = p;
                mejorIdx = i;
            }
        }
        return estudiantes[mejorIdx];
    }


    public int getCantidadEstudiantes() { return notas.length; }
    public int getCantidadEvaluaciones() { return notas[0].length; }
    public String getNombreEstudiante(int i) { return estudiantes[i]; }
}
