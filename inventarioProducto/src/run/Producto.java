package run;

public class Producto {

    private String nombre;
    private String codigo;
    private int cantidad;

    public Producto(String nombre, String codigo, int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getNombre() { return nombre; }
    public String getCodigo() { return codigo; }
    public int getCantidad() { return cantidad; }
}

