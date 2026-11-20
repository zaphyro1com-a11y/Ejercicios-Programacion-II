package main;

import models.Videojuego;

public class Main {
    public static void main(String[] args) {

        // Instanciar Juegos
        Videojuego juego1 = new models.Videojuego();
        Videojuego juego2 = new models.Videojuego();
        Videojuego juego3 = new models.Videojuego();

        // Asignar valores a los atributos
        juego1.nombre = "The Legend of Zelda: Breath of the Wild";
        juego1.genero = "Aventura";
        //juego1.version = "1.0";
        //juego1.activo = false;  

        juego2.nombre = "Super Mario Odyssey";
        juego2.genero = "Plataforma";
        //juego2.version = "1.0";
        //juego2.activo = false;

        juego3.nombre = "Minecraft";
        juego3.genero = "Sandbox";
        //juego3.version = "1.0";
        //juego3.activo = false;

        // Iniciar juegos
        juego1.iniciar();
        juego2.iniciar();
 
        // Mostrar información de los juegos
        juego1.mostrarInformacion();
        juego2.mostrarInformacion();
        juego3.mostrarInformacion();

    }
}
