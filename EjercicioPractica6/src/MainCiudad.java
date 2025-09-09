// Alejandro Abdul Zarruk Sanchez
// Ejercicio 6 Matriz de Temperaturas
// Fecha: 08_09_2025

public class MainCiudad {
    public static void main(String[] args) {
        double[][] datos = {
                {30.5, 32.0, 31.2, 29.8},
                {29.0, 30.1, 28.5, 27.9},
                {28.0, 29.5, 30.0, 26.5},
                {27.5, 28.0, 29.0, 25.0},
                {26.0, 27.5, 28.0, 24.5},
                {25.5, 26.0, 27.0, 23.5},
                {24.0, 25.5, 26.5, 22.0}
        };

        Ciudad ciudad = new Ciudad(datos);

        System.out.println("Promedio semanal:");
        double[] promedios = ciudad.promedioSemanal();
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("Semana " + (i + 1) + ": " + promedios[i] + "°C");
        }

        System.out.println("Temperatura máxima del mes: " + ciudad.temperaturaMaxima() + "°C");
        System.out.println("Día más frío: " + ciudad.diaMasFrio());
    }
}