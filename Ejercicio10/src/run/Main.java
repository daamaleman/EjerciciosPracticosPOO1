package run;

import java.util.Scanner;
import models.Cadena;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cadena cadena = new Cadena();
        System.out.println("=== Gestor de Cadenas ===");
        System.out.print("Ingrese una cadena de texto: ");
        String textoIngresado = entrada.nextLine();
        cadena.setTexto(textoIngresado);

        while (true) {
            System.out.println();
            System.out.println("Seleccione una opcion:");
            System.out.println("1) Convertir a MAYUSCULAS");
            System.out.println("2) Convertir a minusculas");
            System.out.println("3) Invertir cadena");
            System.out.println("4) Verificar si es palindromo");
            System.out.println("5) Contar vocales y consonantes");
            System.out.println("6) Cambiar la cadena");
            System.out.println("0) Salir");
            System.out.print("Opcion: ");

            int opcion = -1;
            try {
                opcion = Integer.parseInt(entrada.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opcion invalida. Intente de nuevo.");
                continue;
            }

            if (opcion == 0) {
                System.out.println("Hasta luego.");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("MAYUSCULAS: " + cadena.aMayusculas());
                    break;
                case 2:
                    System.out.println("minusculas: " + cadena.aMinusculas());
                    break;
                case 3:
                    System.out.println("Invertida: " + cadena.invertir());
                    break;
                case 4:
                    if (cadena.esPalindromo()) {
                        System.out.println("Resultado: Si, es palindromo.");
                    } else {
                        System.out.println("Resultado: No es palindromo.");
                    }
                    break;
                case 5:
                    int v = cadena.contarVocales();
                    int c = cadena.contarConsonantes();
                    System.out.println("Vocales: " + v + " | Consonantes: " + c);
                    break;
                case 6:
                    System.out.print("Nueva cadena: ");
                    cadena.setTexto(entrada.nextLine());
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        }

        entrada.close();
    }
}
