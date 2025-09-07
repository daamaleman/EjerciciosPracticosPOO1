import java.util.*;

public class EstadisticaTexto {
    private String[] palabras;

    public EstadisticaTexto(String[] palabras) {
        this.palabras = palabras;
    }

    public int contarPalabras() {
        return palabras.length;
    }

    public Set<String> palabrasUnicas() {
        Set<String> unicas = new HashSet<>();
        for (String p : palabras) {
            unicas.add(p.toLowerCase());
        }
        return unicas;
    }

    public String palabraMasLarga() {
        String max = palabras[0];
        for (String p : palabras) {
            if (p.length() > max.length()) {
                max = p;
            }
        }
        return max;
    }

    public String palabraMasCorta() {
        String min = palabras[0];
        for (String p : palabras) {
            if (p.length() < min.length()) {
                min = p;
            }
        }
        return min;
    }
}
