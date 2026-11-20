package main;

import models.Producto;

public class Main {
    
    public static void main(String[] args){

        Producto P1 = new Producto("Agua", 1, 100);
        Producto P2 = new Producto("Pan", 0.15, 25);
        Producto P3 = new Producto("Leche", 1.25, 20);
        Producto P4 = new Producto("Huevo", 0.1, 50);
        Producto P5 = new Producto("Chocolate", 2.5, 20);

        IO.println("\nTotal de Productos: " + Producto.getContadorProductos() + "\n");

        P1.mostrarInformacion();
        P2.mostrarInformacion();
        P3.mostrarInformacion();
        P4.mostrarInformacion();
        P5.mostrarInformacion();

    }

}
