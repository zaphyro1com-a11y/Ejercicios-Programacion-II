package models;

public class Usuario {

    //* Atributos Privados */
    private String username = "usuario";
    private String correo = "usuario@ejemplo.com";
    private int nivel = 0;
    private boolean activo;

    //* Propiedades */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            this.username = "usuario";
        } else {
            this.username = username;
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo == null || correo.trim().isEmpty()) {
            this.correo = "usuario@ejemplo.com";
        } else {
            this.correo = correo;
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 0) {
            this.nivel = 0;
        } else {
            this.nivel = nivel;
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    //* Metodos */
    public void activar(){
        setActivo(true);

    }

    public void desactivar(){
        setActivo(false);

    }

}