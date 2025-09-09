package models;
import run.Producto;

public class Inventario {

    private Producto[] productos;
    private int contador;

    public Inventario(int capacidad) {
        productos = new Producto[capacidad];
        contador = 0;
    }

    public void anadirProducto(Producto p) {
        if (contador < productos.length) {
            productos[contador++] = p;
        } else {
            System.out.println("Inventario lleno.");
        }
    }

    public Producto buscarPorCodigo(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (productos[i].getCodigo().equals(codigo)) {
                return productos[i];
            }
        }
        return null;
    }

    public void mostrarTodos() {
        System.out.println("\nLista de Productos Disponibles:");
        System.out.println("Código | Nombre | Cantidad en Stock");
        System.out.println("--------------------------------");
        for (int i = 0; i < contador; i++) {
            System.out.printf("%s | %s | %d%n",
                    productos[i].getCodigo(),
                    productos[i].getNombre(),
                    productos[i].getCantidad());
        }
    }

    public void mostrarBajoStock() {
        for (int i = 0; i < contador; i++) {
            if (productos[i].getCantidad() < 5) {
                System.out.println("Nombre: " + productos[i].getNombre() +
                        ", Cantidad: " + productos[i].getCantidad());
            }
        }
    }
}