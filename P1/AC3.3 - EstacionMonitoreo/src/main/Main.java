package main;

import models.Estacion;

public class Main {

    public static void main(String[] args){

        Estacion E1 = new Estacion("Quito", "Humedad");
        Estacion E2 = new Estacion("Cuenca", "Temperatura");
        Estacion E3 = new Estacion("Guayaquil", "Humedad");

        E1.actualizarLectura(12);
        E2.actualizarLectura(20);
        E3.actualizarLectura(24);

        IO.println("Total Estaciones: " + Estacion.getTotalEstaciones());

        E1.mostrarDatos();
        E2.mostrarDatos();
        E3.mostrarDatos();
        

    }
    
}
