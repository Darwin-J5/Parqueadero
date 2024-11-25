import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear un ClienteRegular
        ClienteRegular cliente = new ClienteRegular();
        cliente.setNombre("Juan");
        cliente.setApellido("Pérez");
        cliente.setIdentificacion(123456789);
        cliente.setNumeroTelefono(987654321);
        cliente.setSuscripcionActiva(true);
        cliente.setMetodoPago("Tarjeta de crédito");

        // Crear un Vehículo
        Automovil auto = new Automovil();
        auto.setModelo("Toyota Corolla");
        auto.setMatricula("XYZ-123");
        auto.setColor("Rojo");
        auto.setNumeroPuertas(4);

        // Mostrar información
        System.out.println("Cliente:");
        System.out.println("Nombre: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("ID: " + cliente.getIdentificacion());
        System.out.println("Teléfono: " + cliente.getNumeroTelefono());
        System.out.println("Suscripción activa: " + cliente.isSuscripcionActiva());
        System.out.println("Método de pago: " + cliente.getMetodoPago());

        System.out.println("\nVehículo:");
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Matrícula: " + auto.getMatricula());
        System.out.println("Color: " + auto.getColor());
        System.out.println("Número de puertas: " + auto.getNumeroPuertas());

        // Crear una lista de espacios en el parqueadero
        ArrayList<Espacio> espacios = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            Espacio espacio = new Espacio();
            espacio.setNumeroEspacio(i);
            espacio.setOcupado(false); // Todos los espacios están libres inicialmente
            espacio.setEspacioPreferencial(i % 7 == 0); // Alternar espacios preferenciales
            espacios.add(espacio);
        }

        // Mostrar los espacios disponibles antes de la reserva
        System.out.println("\nEspacios disponibles antes de la reserva:");
        for (Espacio espacio : espacios) {
            if (!espacio.isOcupado()) {
                System.out.println("Espacio #" + espacio.getNumeroEspacio() + " (Preferencial: " + espacio.isEspacioPreferencial() + ")");
            }
        }

        // Intentar realizar una reserva para el cliente
        Reserva reserva = new Reserva();
        Espacio espacioReservado = reserva.reservarEspacio(cliente, espacios);

        // Verificar si la reserva fue exitosa
        if (espacioReservado != null) {
            System.out.println("\nReserva exitosa:");
            System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
            System.out.println("Espacio reservado: #" + espacioReservado.getNumeroEspacio());
        } else {
            System.out.println("\nNo fue posible realizar la reserva. Verifique la suscripción o disponibilidad de espacios.");
        }

        // Mostrar los espacios disponibles después de la reserva
        System.out.println("\nEspacios disponibles después de la reserva:");
        for (Espacio espacio : espacios) {
            if (!espacio.isOcupado()) {
                System.out.println("Espacio #" + espacio.getNumeroEspacio() + " (Preferencial: " + espacio.isEspacioPreferencial() + ")");
            }
        }
    }
}