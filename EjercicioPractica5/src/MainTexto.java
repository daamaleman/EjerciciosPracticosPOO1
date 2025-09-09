// Alejandro Abdul Zarruk Sanchez
// Ejercicio 5 Análisis de Texto
// Fecha: 08_09_2025

public class MainTexto {
    public static void main(String[] args) {
        AnalizadorTexto analizador = new AnalizadorTexto("Pepe se peina, Pepe pica papas, Pepe se come una piña, Pepe tiene pocas pecas. ");

        System.out.println("Total de palabras: " + analizador.contarPalabras());
        System.out.println("Ocurrencias de 'Pepe': " + analizador.contarOcurrencias("Pepe"));
        System.out.println("Texto modificado: " + analizador.reemplazarPalabra("Pepe", "Juan"));
    }
}