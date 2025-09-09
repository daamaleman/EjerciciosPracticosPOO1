package gestorLibros;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;

    // Constructor
    public Libro(String titulo, String autor, int anio) {
        setTitulo(titulo);
        setAutor(autor);
        setAnio(anio);
    }

    // Getters y Setters con validación
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("❌ El título no puede estar vacío.");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.trim().isEmpty()) {
            this.autor = autor;
        } else {
            throw new IllegalArgumentException("❌ El autor no puede estar vacío.");
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio > 0) {
            this.anio = anio;
        } else {
            throw new IllegalArgumentException("❌ El año debe ser positivo.");
        }
    }

    public String mostrarInfo() {
        return "📖 \"" + titulo + "\" | Autor: " + autor + " | Año: " + anio;
    }
}
