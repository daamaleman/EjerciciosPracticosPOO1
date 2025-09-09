public class Ciudad {
    private double[][] temperaturas; // 7 días x 4 semanas

    /**
     * Constructor que inicializa la matriz de temperaturas.
     * param temperaturas Matriz 7x4 con temperaturas
     */
    public Ciudad(double[][] temperaturas) {
        this.temperaturas = temperaturas;
    }

    /**
     * Calcula el promedio de temperaturas por semana.
     * return Arreglo con promedio semanal
     */
    public double[] promedioSemanal() {
        double[] promedios = new double[4];
        for (int semana = 0; semana < 4; semana++) {
            double suma = 0;
            for (int dia = 0; dia < 7; dia++) {
                suma += temperaturas[dia][semana];
            }
            promedios[semana] = suma / 7;
        }
        return promedios;
    }

    /**
     * Encuentra la temperatura máxima del mes.
     * return Valor máximo
     */
    public double temperaturaMaxima() {
        double max = temperaturas[0][0];
        for (int semana = 0; semana < 4; semana++) {
            for (int dia = 0; dia < 7; dia++) {
                if (temperaturas[dia][semana] > max) {
                    max = temperaturas[dia][semana];
                }
            }
        }
        return max;
    }

    /**
     * Encuentra el día más frío del mes.
     * return String con día y semana
     */
    public String diaMasFrio() {
        double min = temperaturas[0][0];
        int diaMin = 0, semanaMin = 0;
        for (int semana = 0; semana < 4; semana++) {
            for (int dia = 0; dia < 7; dia++) {
                if (temperaturas[dia][semana] < min) {
                    min = temperaturas[dia][semana];
                    diaMin = dia;
                    semanaMin = semana;
                }
            }
        }
        return "Día " + (diaMin + 1) + ", Semana " + (semanaMin + 1) + " con " + min + "°C";
    }
}
