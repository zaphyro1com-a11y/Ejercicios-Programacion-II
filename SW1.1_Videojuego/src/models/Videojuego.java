package models;

public class Videojuego {
    
    //* Atributos */
    // Atributos publuicos
    public String nombre;
    public String genero;

    // Atributos por defecto
    String version;
    boolean activo;

    //* Metodos */
    // Metodos publicos
    public void mostrarInformacion(){

        System.out.println("Informacion del Videojuego");
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Version: " + version);
        System.out.println("Activo: " + activo);
        System.out.println("================================");

    }
    public void iniciar(){
        System.out.print("Iniciando el videojuego: " + nombre + "\n");
        this.activo = true;
    }

    // Metodos por defecto
    void cerrar(){
        System.out.print("Cerrando el videojuego: " + nombre + "\n");
        this.activo = false;
    }

    void MostrarVersion(){
        System.out.print("Version del videojuego: " + version + "\n");
    }

}
