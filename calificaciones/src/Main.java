import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistema de Calificaciones ===");
        System.out.print("Nombre del curso: ");
        String nombreCurso = sc.nextLine().trim();

        int cantEstudiantes = leerEnteroPositivo(sc, "Cantidad de estudiantes: ");
        int cantEvaluaciones = leerEnteroPositivo(sc, "Cantidad de evaluaciones: ");

        Curso curso = new Curso(nombreCurso, cantEstudiantes, cantEvaluaciones);

        curso.cargarDatosDesdeUsuario(sc);

        System.out.println("\n--- Promedios por estudiante ---");
        for (int i = 0; i < curso.getCantidadEstudiantes(); i++) {
            double prom = curso.promedioPorEstudiante(i);
            System.out.printf("  %s: %.2f%n", curso.getNombreEstudiante(i), prom);
        }

        System.out.println("\n--- Promedios por evaluación ---");
        for (int j = 0; j < curso.getCantidadEvaluaciones(); j++) {
            double prom = curso.promedioPorEvaluacion(j);
            System.out.printf("  Evaluación %d: %.2f%n", (j + 1), prom);
        }

        String mejor = curso.estudianteConMejorRendimiento();
        System.out.println("\n*** Estudiante con mejor rendimiento: " + mejor + " ***");

        sc.close();
        System.out.println("\nFin del programa.");
    }

    private static int leerEnteroPositivo(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = sc.nextLine().trim();
            try {
                int n = Integer.parseInt(entrada);
                if (n <= 0) {
                    System.out.println("  -> Debe ser un entero positivo.");
                } else {
                    return n;
                }
            } catch (NumberFormatException e) {
                System.out.println("  -> Ingresa un número entero válido.");
            }
        }
    }
}