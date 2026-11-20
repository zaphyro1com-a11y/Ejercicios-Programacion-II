package main;

import models.Usuario;

public class Main {
    
    public static void main(String[] args){

        Usuario U1 = new Usuario("Lio", "lio@gmail.com");
        Usuario U2 = new Usuario("Gabo", "gabo@gmail.com");
        Usuario U3 = new Usuario("Dany", "dany@gmail.com");
        Usuario U4 = new Usuario("Matheo", "matheo@gmail.com");

        IO.println("Usuarios: " + Usuario.getContadorUsuarios());

    }

}
