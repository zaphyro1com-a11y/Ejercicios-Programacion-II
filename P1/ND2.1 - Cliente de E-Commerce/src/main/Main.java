package main;

import models.Cliente;

public class Main{

    public static void main(String[] args){

        Cliente C1 = new Cliente();

        C1.setCorreo("leonardofloresgaona@gmail.com");
        C1.setEdad(-5);
        C1.setSaldo(-100);
        C1.setNombre("Leonardo");

        IO.println("Nombre: " + C1.getNombre());
        IO.println("Correo: " + C1.getCorreo());
        IO.println("Edad: " + C1.getEdad());
        IO.println("Saldo: " + C1.getSaldo());

    }

}
