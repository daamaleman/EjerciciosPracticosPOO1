package models;
import run.Contacto;

public class Agenda {

    private Contacto[] contactos;
    private int contador;

    public Agenda(int capacidad) {
        contactos = new Contacto[capacidad];
        contador = 0;
    }

    public void anadirContacto(Contacto c) {
        if (contador < contactos.length) {
            contactos[contador++] = c;
        } else {
            System.out.println("Agenda llena.");
        }
    }

    public Contacto buscarPorNombre(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNombre().equals(nombre)) {
                return contactos[i];
            }
        }
        return null;
    }

    public void mostrarTodos() {
        System.out.println("\nLista de Contactos:");
        System.out.println("Nombre | Teléfono | Correo");
        System.out.println("---------------------------");
        for (int i = 0; i < contador; i++) {
            System.out.printf("%s | %s | %s%n",
                    contactos[i].getNombre(),
                    contactos[i].getTelefono(),
                    contactos[i].getCorreo());
        }
    }

    public void buscarPorDominio(String dominio) {
        System.out.println("\nContactos con dominio " + dominio + ":");
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getCorreo().contains(dominio)) {
                System.out.println("Nombre: " + contactos[i].getNombre() +
                        ", Correo: " + contactos[i].getCorreo());
            }
        }
    }
}

