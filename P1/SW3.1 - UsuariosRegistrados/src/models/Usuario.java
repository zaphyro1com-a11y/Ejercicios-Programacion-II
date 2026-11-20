package models;

public class Usuario {

    //* Static */
    private static int contadorUsuarios = 0;
    
    //* Atributos Privados */
    private int id;
    private String username;
    private String correo;
    private boolean activo;

    //* constructor */
    public Usuario(String username, String correo){
        setUsername(username);
        setCorreo(correo);
        id = ++contadorUsuarios;
        activo = true;

    }

    //* Propiedades */
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("El username no puede estar vacío.");
        }
        this.username = username.trim();
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo == null || !correo.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {
            throw new IllegalArgumentException("El correo no tiene un formato válido.");
        }
        this.correo = correo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    //* Propiedades Static */
    public static int getContadorUsuarios(){
            return contadorUsuarios;
    }

}
