package models;

public class Cliente {

    //* Atributos Privados */
    private String nombre;
    private String correo;
    private int edad;
    private double saldo;


    //* Propiedades */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            this.nombre = "";
            return;
        }
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo == null || correo.isBlank()) {
            this.correo = "";
            return;
        }
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            this.edad = 0;
            return;
        }
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            this.saldo = 0;
            return;
        }
        this.saldo = saldo;
    }

}