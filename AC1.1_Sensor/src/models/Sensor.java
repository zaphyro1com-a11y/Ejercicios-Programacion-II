package models;

public class Sensor {
    
    //* Atributos */
    public String nombre;
    public double lectura;
    String tipo;
    String unidad;

    //* Metodos */
    // Metodos publicos
    public void mostrarInformacion(){
        System.out.println("Informacion del Sensor");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Lectura: " + lectura);
        System.out.println("Unidad: " + unidad);
        System.out.println("================================");
    }

    public void actualizarLectura(double nuevaLectura){
        lectura = nuevaLectura;
    }

}
