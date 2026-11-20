package models;

public class Motor {

    //* Atributos Privados */
    private String nombre;
    private double potencia;    
    private int velocidad;  
    private boolean encendido; 
    
    //* Propiedades */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        if (potencia < 0) {
            throw new IllegalArgumentException("La potencia no puede ser negativa.");
        }
        this.potencia = potencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad < 0 || velocidad > 100) {
            throw new IllegalArgumentException("La velocidad debe estar entre 0 y 100.");
        }
        this.velocidad = velocidad;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    //* Metodos */
    public void encender(){
        setEncendido(true);

    }

    public void apagar(){
        setEncendido(false);
        
    }


}