package models;

public class Jugador {
    private String nombre;
    private char ficha; // 'X' u 'O'

    public Jugador() {
    }

    public Jugador(String nombre, char ficha) {
        this.nombre = nombre;
        this.ficha = ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre.trim();
        }
    }

    public char getFicha() {
        return ficha;
    }

    public void setFicha(char ficha) {
        this.ficha = ficha;
    }
}
