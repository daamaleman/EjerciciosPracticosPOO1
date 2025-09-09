package run;
import models.Agenda;
import java.util.Scanner;


public class MainAgenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda(5);

        // Añadir algunos contactos de ejemplo
        agenda.anadirContacto(new Contacto("Juan", "123456", "juan@gmail.com"));
        agenda.anadirContacto(new Contacto("María", "654321", "maria@yahoo.com"));
        agenda.anadirContacto(new Contacto("Pedro", "111222", "pedro@gmail.com"));

        // Mostrar la lista de contactos
        agenda.mostrarTodos();

        // Solicitar al usuario que ingrese el nombre a buscar
        System.out.print("\nIngrese el nombre del contacto a buscar: ");
        String nombreBuscado = scanner.nextLine().trim(); // Usar trim() para eliminar espacios o saltos

        Contacto contactoEncontrado = agenda.buscarPorNombre(nombreBuscado);
        if (contactoEncontrado != null) {
            System.out.println("Contacto encontrado: Nombre: " + contactoEncontrado.getNombre() +
                    ", Teléfono: " + contactoEncontrado.getTelefono() +
                    ", Correo: " + contactoEncontrado.getCorreo());
        } else {
            System.out.println("Contacto no encontrado.");
        }

        System.out.print("\nIngrese el dominio a buscar (ejemplo: @gmail.com): ");
        String dominioBuscado = scanner.nextLine().trim();
        agenda.buscarPorDominio(dominioBuscado);

        scanner.close();
    }
}