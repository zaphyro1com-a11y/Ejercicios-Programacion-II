package models;

public class Usuario {
    
    //* Atributos */
    private String username;
    private String correo;

    //* Constructor */
    public Usuario(String username, String correo) {
        this.username = username;
        this.correo = correo;
    }

    //* Propiedades */
    public String getUsername(){return username;}

    public String obtenerPermisos(){
        return "Permisos básicos";
    }

    protected String getCorreo(){return correo;}

    public String mostrarInformacion(){
        return "Usuario: " + username + ", Correo: " + correo;
    }


}
