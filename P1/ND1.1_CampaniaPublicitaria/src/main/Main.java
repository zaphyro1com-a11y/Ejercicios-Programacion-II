package main;

import models.Campania;

public class Main {

    public static void main(String[] args){

        // Instanciar cmapañas
        Campania c_instagram = new Campania();
        Campania c_tiktok = new Campania();
        Campania c_facebook = new Campania();

        // Asignar valores a las campañas
        c_facebook.nombre = "Campaña Facebook";
        c_facebook.presupuesto = 1000;
        c_facebook.activarCampania();

        c_instagram.nombre = "Campaña Instagram";
        c_instagram.presupuesto = 2000;

        c_tiktok.nombre = "Campaña TikTok";
        c_tiktok.presupuesto = 3000;

        // Mostrar información de las campañas
        c_facebook.mostrarInformacion();
        c_instagram.mostrarInformacion();
        c_tiktok.mostrarInformacion();


    }
    
}
