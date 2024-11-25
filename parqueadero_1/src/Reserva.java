
import java.util.ArrayList;

public class Reserva {

    public Espacio reservarEspacio(ClienteRegular cliente, ArrayList<Espacio> espacios) {

        if (cliente.isSuscripcionActiva()) {

            for (Espacio espacio : espacios) {
                if (!espacio.isOcupado()) { // Espacio no está ocupado
                    espacio.setOcupado(true); // Marcar el espacio como ocupado
                    System.out.println("Reserva realizada para el cliente: " + cliente.getNombre());
                    return espacio; // Retornar el espacio reservado
                }
            }
            System.out.println("No hay espacios disponibles.");
        } else {
            System.out.println("El cliente no tiene una suscripción activa. No se puede realizar la reserva.");
        }
        return null;
    }
}
