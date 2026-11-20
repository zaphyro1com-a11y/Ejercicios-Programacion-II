package models;

public class Campania {

    //*Atributos */
    // Atributos Publicos
    public String nombre;
    public double presupuesto;

    // Atributos default
    String plataforma;
    boolean activa;

    //*Metodos */
    // Metodos Publicos
    public void mostrarInformacion() { 
        System.out.println("Información de la campaña:");
        System.out.println("-----------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Presupuesto: " + presupuesto);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Activa: " + activa);
        System.out.println("-----------------------------");
    }
    public void activarCampania() {
        activa = true;
    }


}