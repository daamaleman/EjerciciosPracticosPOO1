public class AnalizadorTexto {
    private String texto;
    /**
     * Constructor que inicializa el texto a analizar.
     * param texto Texto original
     */
    public AnalizadorTexto(String texto) {
        this.texto = texto;
    }

    /**
     * Cuenta cuántas palabras hay en el texto.
     * return Número total de palabras
     */
    public int contarPalabras() {
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }

    /**
     * Cuenta cuántas veces aparece una palabra específica.
     * param palabra Palabra a buscar
     * return Número de ocurrencias
     */
    public int contarOcurrencias(String palabra) {
        String[] palabras = texto.toLowerCase().split("\\s+");
        int contador = 0;
        for (String p : palabras) {
            if (p.replaceAll("[^a-zA-Záéíóúñ]", "").equals(palabra.toLowerCase())) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Reemplaza una palabra por otra en el texto.
     * param original Palabra original
     * param reemplazo Palabra nueva
     * return Texto modificado
     */
    public String reemplazarPalabra(String original, String reemplazo) {
        return texto.replaceAll("\\b" + original + "\\b", reemplazo);
    }

    /**
     * Devuelve el texto actual.
     * return Texto original o modificado
     */
    public String getTexto() {
        return texto;
    }
}


