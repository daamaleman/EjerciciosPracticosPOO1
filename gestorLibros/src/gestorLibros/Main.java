package gestorLibros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos libros desea registrar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Libro[] libros = new Libro[cantidad];

        // Registro de libros
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n📌 Registro del libro " + (i + 1));

            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Autor: ");
            String autor = sc.nextLine();

            System.out.print("Año: ");
            int anio = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            libros[i] = new Libro(titulo, autor, anio);
        }

        // Menú de opciones
        int opcion;
        do {
            System.out.println("\n=== 📚 GESTOR DE LIBROS ===");
            System.out.println("1. Buscar libros por autor");
            System.out.println("2. Buscar libros por palabra clave en el título");
            System.out.println("3. Mostrar libros publicados después del 2010");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el autor a buscar: ");
                    String autorBuscado = sc.nextLine();
                    boolean encontrado = false;
                    for (Libro l : libros) {
                        if (l.getAutor().equalsIgnoreCase(autorBuscado)) {
                            System.out.println(l.mostrarInfo());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) System.out.println("⚠️ No se encontraron libros de ese autor.");
                }
                case 2 -> {
                    System.out.print("Ingrese palabra clave del título: ");
                    String clave = sc.nextLine().toLowerCase();
                    boolean encontrado = false;
                    for (Libro l : libros) {
                        if (l.getTitulo().toLowerCase().contains(clave)) {
                            System.out.println(l.mostrarInfo());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) System.out.println("⚠️ No se encontraron libros con esa palabra clave.");
                }
                case 3 -> {
                    System.out.println("📌 Libros publicados después del 2010:");
                    boolean encontrado = false;
                    for (Libro l : libros) {
                        if (l.getAnio() > 2010) {
                            System.out.println(l.mostrarInfo());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) System.out.println("⚠️ No hay libros posteriores al 2010.");
                }
                case 4 -> System.out.println("👋 Saliendo del programa...");
                default -> System.out.println("⚠️ Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
