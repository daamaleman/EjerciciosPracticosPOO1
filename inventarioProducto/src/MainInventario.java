import models.Inventario;
import run.Producto;
import java.util.Scanner;


public class MainInventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario(5);

        // Añadir algunos productos de ejemplo
        inventario.anadirProducto(new Producto("Laptop", "L001", 3));
        inventario.anadirProducto(new Producto("Mouse", "M001", 7));
        inventario.anadirProducto(new Producto("Teclado", "T001", 2));
        inventario.anadirProducto(new Producto("Tablet", "Tablet", 4));

        // Mostrar la lista de productos con códigos, nombres y stock
        inventario.mostrarTodos();

        System.out.println("\nProductos con stock < 5:");
        inventario.mostrarBajoStock();

        // Solicitar al usuario que ingrese el código del producto a buscar
        System.out.print("\nIngrese el código del producto a buscar (ejemplo: L001, M001, T001): ");
        String codigoBuscado = scanner.nextLine();

        Producto encontrado = inventario.buscarPorCodigo(codigoBuscado);
        if (encontrado != null) {
            System.out.println("Producto encontrado: Código " + encontrado.getCodigo() +
                    ", Nombre: " + encontrado.getNombre() +
                    ", Cantidad en Stock: " + encontrado.getCantidad());
        } else {
            System.out.println("Producto no encontrado.");
        }

        scanner.close();
    }
}