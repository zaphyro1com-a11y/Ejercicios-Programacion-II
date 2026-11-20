package main;

import models.Sensor;

public class Main {
    
    public static void main(String[] args) {
        // Instanciar sensores de temperatura, humedad y presion
        Sensor S_temperatura = new Sensor();
        Sensor S_humedad = new Sensor();
        Sensor S_presion = new Sensor();

        // Llenar datos
        S_temperatura.nombre= "Sensor de temperatura";
        S_humedad.nombre= "Sensor de humedad";
        S_presion.nombre= "Sensor de presion";

        S_temperatura.lectura= 15.20;
        S_humedad.lectura= 22.01;
        S_presion.lectura= 4.51;

        S_humedad.actualizarLectura(26.54);
        S_presion.actualizarLectura(4.12);

        // mostrar informacion
        S_humedad.mostrarInformacion();
        S_presion.mostrarInformacion();
        S_temperatura.mostrarInformacion();
    
    }

}
