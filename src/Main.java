import java.util.Scanner;
import Rutas.Pasajeros;
import Rutas.Rutas;
import Rutas.Normal;
import Rutas.Vip;

public class Main {
    public static void main(String[] args) {

        // Creacion de los Pasajeros
        Pasajeros pasajero1 = new Pasajeros();
        Pasajeros pasajero2 = new Pasajeros();
        Pasajeros pasajero3 = new Pasajeros();
        Pasajeros pasajero4 = new Pasajeros();
        Pasajeros pasajero5 = new Pasajeros();

        pasajero1.setNombre("Carlos");
        pasajero1.setApellido("Perez");
        pasajero1.setTelefono("0986508495");
        pasajero1.ImprimirDatos();

        pasajero2.setNombre("Carlos2");
        pasajero2.setApellido("Perez2");
        pasajero2.setTelefono("0986508495");
        pasajero2.ImprimirDatos();

        Rutas ruta1 = new Rutas();
        ruta1.setRuta("Quito-Guayaquil");
        ruta1.setPrecio(17.50);

        Rutas ruta2 = new Rutas();
        ruta2.setRuta("Quito-Guayaquil");
        ruta2.setPrecio(17.50);

       Normal normal1 = new Normal();
       String nombre = pasajero1.getNombre();
       String ruta = ruta1.getRuta();
       String ticket = "Normal";
       double precio = ruta1.getPrecio();

       Vip vip1 = new Vip();
       String nombre_2 = pasajero2.getNombre();
       String ruta_2 = ruta2.getRuta();
       String ticket_2 = "Vip";
       double precio_2 = ruta2.getPrecio();

       normal1.ImprimirDatos(nombre,ruta,ticket,precio);
       vip1.ImprimirDatosVip(nombre_2,ruta_2,ticket_2,precio_2);











    }
}