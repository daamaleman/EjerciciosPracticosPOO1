package run;

import java.util.Scanner;
import models.Jugador;
import models.Tablero;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Tablero tablero = new Tablero();
        tablero.reiniciar();

        Jugador jugadorUno = new Jugador();
        System.out.print("Nombre del Jugador 1 (X): ");
        jugadorUno.setNombre(entrada.nextLine());
        jugadorUno.setFicha('X');

        Jugador jugadorDos = new Jugador();
        System.out.print("Nombre del Jugador 2 (O): ");
        jugadorDos.setNombre(entrada.nextLine());
        jugadorDos.setFicha('O');

        Jugador jugadorActual = jugadorUno;

        // Bucle principal
        while (true) {
            tablero.mostrar();
            System.out.println("Turno de " + jugadorActual.getNombre());

            System.out.print("Fila (0-2): ");
            int fila = entrada.nextInt();
            System.out.print("Columna (0-2): ");
            int columna = entrada.nextInt();

            // Intentar colocar ficha
            if (!tablero.colocarFicha(fila, columna, jugadorActual.getFicha())) {
                System.out.println("Movimiento inválido. Intente de nuevo.");
                continue;
            }

            // Verificar si el jugador actual gana
            if (tablero.hayGanador(jugadorActual.getFicha())) {
                tablero.mostrar();
                System.out.println("¡" + jugadorActual.getNombre() + " ha ganado!");
                break;
            }

            // Empate
            if (tablero.hayEmpate()) {
                tablero.mostrar();
                System.out.println("Empate.");
                break;
            }

            // Cambiar turno
            jugadorActual = (jugadorActual == jugadorUno) ? jugadorDos : jugadorUno;
        }

        entrada.close();
    }
}
