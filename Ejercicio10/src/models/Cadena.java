package models;

public class Cadena {
    private String texto;

    public Cadena() {
    }

    public Cadena(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    // Convierte el texto a mayusculas y lo devuelve
    public String aMayusculas() {
        if (texto == null) {
            return null;
        }
        return texto.toUpperCase();
    }

    // Convierte el texto a minusculas y lo devuelve
    public String aMinusculas() {
        if (texto == null) {
            return null;
        }
        return texto.toLowerCase();
    }

    // Invierte el texto y lo devuelve
    public String invertir() {
        if (texto == null) {
            return null;
        }
        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }
        return invertida;
    }

    // Verifica si el texto es palindromo (ignora espacios y mayusculas/minusculas)
    public boolean esPalindromo() {
        if (texto == null) {
            return false;
        }
        String limpio = limpiarParaComparacion(texto);
        String invertido = "";
        for (int i = limpio.length() - 1; i >= 0; i--) {
            invertido += limpio.charAt(i);
        }
        return limpio.equals(invertido);
    }

    // Cuenta cuantas vocales tiene el texto (solo letras)
    public int contarVocales() {
        if (texto == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char actual = Character.toLowerCase(texto.charAt(i));
            if (esLetra(actual) && esVocal(actual)) {
                contador++;
            }
        }
        return contador;
    }

    // Cuenta cuantas consonantes tiene el texto (solo letras)
    public int contarConsonantes() {
        if (texto == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char actual = Character.toLowerCase(texto.charAt(i));
            if (esLetra(actual) && !esVocal(actual)) {
                contador++;
            }
        }
        return contador;
    }

    // ----------- Metodos privados de apoyo -----------

    // Deja solo letras y numeros, sin espacios; pasa a minusculas
    private String limpiarParaComparacion(String original) {
        String resultado = "";
        for (int i = 0; i < original.length(); i++) {
            char actual = original.charAt(i);
            if (Character.isLetterOrDigit(actual)) {
                resultado += Character.toLowerCase(actual);
            }
        }
        return resultado;
    }

    // Verifica si un caracter es una letra (a-z)
    private boolean esLetra(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    // Verifica si un caracter es vocal (a, e, i, o, u)
    private boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
