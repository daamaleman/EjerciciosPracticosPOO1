package models;

public class Tablero {
    private char[][] celdas;

    public Tablero() {
    }

    // Constructor con parámetros
    public Tablero(char[][] celdasIniciales) {
        this.celdas = new char[3][3];
        if (celdasIniciales != null && celdasIniciales.length == 3 && celdasIniciales[0].length == 3) {
            for (int f = 0; f < 3; f++) {
                for (int c = 0; c < 3; c++) {
                    this.celdas[f][c] = celdasIniciales[f][c];
                }
            }
        }
    }

    public char[][] getCeldas() {
        return celdas;
    }

    public void setCeldas(char[][] nuevasCeldas) {
        if (nuevasCeldas != null && nuevasCeldas.length == 3 && nuevasCeldas[0].length == 3) {
            this.celdas = new char[3][3];
            for (int f = 0; f < 3; f++) {
                for (int c = 0; c < 3; c++) {
                    this.celdas[f][c] = nuevasCeldas[f][c];
                }
            }
        }
    }

    public void reiniciar() {
        if (celdas == null) {
            celdas = new char[3][3];
        }
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                celdas[f][c] = ' ';
            }
        }
    }

    public boolean colocarFicha(int fila, int columna, char ficha) {
        if (!posicionValida(fila, columna)) {
            return false;
        }
        if (celdas[fila][columna] != ' ') {
            return false;
        }
        celdas[fila][columna] = ficha;
        return true;
    }

    public boolean hayGanador(char ficha) {
        // Revisa filas
        for (int f = 0; f < 3; f++) {
            if (celdas[f][0] == ficha && celdas[f][1] == ficha && celdas[f][2] == ficha) {
                return true;
            }
        }
        // Revisa columnas
        for (int c = 0; c < 3; c++) {
            if (celdas[0][c] == ficha && celdas[1][c] == ficha && celdas[2][c] == ficha) {
                return true;
            }
        }
        // Revisa diagonales
        if (celdas[0][0] == ficha && celdas[1][1] == ficha && celdas[2][2] == ficha) {
            return true;
        }
        if (celdas[0][2] == ficha && celdas[1][1] == ficha && celdas[2][0] == ficha) {
            return true;
        }
        return false;
    }

    public boolean hayEmpate() {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                if (celdas[f][c] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Muestra el tablero en consola
    public void mostrar() {
        System.out.println();
        System.out.println("   0   1   2 ");
        for (int f = 0; f < 3; f++) {
            System.out.println("  ---+---+---");
            System.out.print(f + " ");
            for (int c = 0; c < 3; c++) {
                char valor = (celdas != null) ? celdas[f][c] : ' ';
                System.out.print(" " + valor + " ");
                if (c < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        System.out.println("  ---+---+---");
        System.out.println();
    }

    private boolean posicionValida(int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3;
    }
}
