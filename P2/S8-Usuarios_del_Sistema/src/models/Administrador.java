package models;

public class Administrador extends Usuario {
    
    //* Constructor */
    public Administrador(String username, String correo) {
        super(username, correo);
    }

    //* Propiedades */
    @Override
    public String obtenerPermisos(){
        return "Permisos de administrador";
    }

    @Override 
    public String mostrarInformacion(){
        return "Permisos: " + obtenerPermisos() + " | Administrador: " + getUsername() + ", Correo: " + getCorreo();
        

    }
    
}
