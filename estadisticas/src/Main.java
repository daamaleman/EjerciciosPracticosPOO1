import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Estadísticas de Palabras ===");
        System.out.print("Ingresa una frase o varias palabras separadas por espacios: ");
        String texto = sc.nextLine().trim();

        String[] palabras = texto.split("\\s+");
        EstadisticaTexto estadistica = new EstadisticaTexto(palabras);

        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad de palabras: " + estadistica.contarPalabras());
        System.out.println("Palabras únicas: " + estadistica.palabrasUnicas());
        System.out.println("Palabra más larga: " + estadistica.palabraMasLarga());
        System.out.println("Palabra más corta: " + estadistica.palabraMasCorta());

        sc.close();
    }
}
