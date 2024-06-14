package Rutas;

import java.util.Scanner;

public class Ticket extends Rutas{
    String Tipo_ticket;


    public Ticket() {
    }

    public Ticket(String tipo_ticket) {
        Tipo_ticket = tipo_ticket;
    }

    public String getTipo_ticket() {
        return Tipo_ticket;
    }

    public void setTipo_ticket(String tipo_ticket) {
        Tipo_ticket = tipo_ticket;
    }

    public void Servicios () {
        System.out.println("Seleccione el Servicio: ");
        System.out.println("1. Normal \n 2 Vip");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su seleccion: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Datos Servicio Normal");
                setTipo_ticket("Normal");
                System.out.println("1. Selección de asientos: ventana, pasillo, al final, adelante. \n 2. Espacio para una maleta. \n 3. Espacio para una maleta por costo extra.");
                break;

            case 2:
                System.out.println("Datos Servicio Vip");
                setTipo_ticket("Vip");
                System.out.println("1. Televisión, internet y otros dos servicios adicionales a su consideración. \n 2. Espacio para dos maletas. \n 3. Opción a una maleta adicional por costo extra.");
                break;
        }
    }
}
