package Rutas;
public class Normal extends Rutas{

    public Normal() {
    }

    public void ImprimirDatos(String nombre, String ruta, String ticket, double precio) {
        System.out.println("Datos de servicio Normal");
        System.out.println("Nombre Pasajero: " + nombre);
        System.out.println("Ruta Pasajero: " + ruta);
        System.out.println("Tipo de servicio: " + ticket);
        System.out.println("Precio Ticket:" + precio);

    }
}
