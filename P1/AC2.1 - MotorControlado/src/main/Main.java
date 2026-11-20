package main;

import models.Motor;

public class Main {
    
    public static void main(String[] args){

        Motor M1 = new Motor();

        M1.setNombre("MB12");
        M1.setPotencia(2.5);
        M1.setVelocidad(15);
        M1.apagar();

        IO.println("Nombre: " + M1.getNombre());
        IO.println("Potencia: " + M1.getPotencia());
        IO.println("Velocidad: " + M1.getVelocidad());

        String estado = M1.isEncendido()? "Encendido" : "Apagado";
        IO.println("Estado: " + estado);

    }

}
