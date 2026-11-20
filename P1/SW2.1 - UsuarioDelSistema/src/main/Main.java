package main;

import models.Usuario;

public class Main {
    
    public static void main(String[] args){

        Usuario U1 = new Usuario();

        U1.setUsername("Lion011");
        U1.setCorreo("lion011@gmail.com");
        U1.setNivel(11);
        U1.activar();

        IO.println("Username: " + U1.getUsername());
        IO.println("Correo: " + U1.getCorreo());
        IO.println("Nivel: " + U1.getNivel());

        String estado = U1.isActivo()? "Activo" : "Falso";
        IO.println("Estado: " + estado);


    }

}
