package estudiantes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes desea registrar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Estudiante[] estudiantes = new Estudiante[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n📌 Registro del estudiante " + (i + 1));

            System.out.print("Ingrese el nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();

            System.out.print("¿Cuántas notas va a ingresar?: ");
            int numNotas = sc.nextInt();

            double[] notas = new double[numNotas];
            for (int j = 0; j < numNotas; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[j] = sc.nextDouble();
            }
            sc.nextLine(); // limpiar buffer

            estudiantes[i] = new Estudiante(nombre, edad, notas);
        }

        // Mostrar estudiantes con promedio mayor a 8.0
        System.out.println("\n✅ Estudiantes con promedio mayor a 8.0:");
        for (Estudiante e : estudiantes) {
            if (e.calcularPromedio() > 8.0) {
                System.out.println(e.mostrarDatos());
            }
        }

        sc.close();
    }
}
