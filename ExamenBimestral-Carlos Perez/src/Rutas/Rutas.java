package Rutas;

import java.util.Scanner;

public class Rutas extends Pasajeros {

    double precio;
    String ruta;

    public Rutas() {
    }

    public Rutas(double precio, String ruta) {
        this.precio = precio;
        this.ruta = ruta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }


    public void Rutas () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una ruta: ");
        System.out.println("1.Quito-Guayaquil \n2.Quito-Puyo \n3.Quito-Tulcán \n4.Quito-Riobamba");
        System.out.println("Ingrese su seleccion: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Quito-Guayaquil");
                setRuta("Quito-Guayaquil");
                setPrecio(20);
                System.out.println("Precio ticket: " + getPrecio());
                break;

            case 2:
                System.out.println("Quito-Puyo");
                setRuta("Quito-Puyo");
                setPrecio(15);
                System.out.println("Precio ticket: " + getPrecio());
                break;

            case 3:
                System.out.println("Quito-Tulcán");
                setRuta("Quito-Tulcán");
                setPrecio(17.50);
                System.out.println("Precio ticket: " + getPrecio());
                break;

            case 4:
                System.out.println("Quito-Riobamba");
                setRuta("Quito-Riobamba");
                setPrecio(17.50);
                System.out.println("Precio ticket: " + getPrecio());
                break;
        }
    }
}
