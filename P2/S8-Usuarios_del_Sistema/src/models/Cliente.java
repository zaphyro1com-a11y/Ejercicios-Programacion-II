package models;

public class Cliente extends Usuario {
    
    //* Constructor */
    public Cliente(String username, String correo) {
        super(username, correo);
    }

    //* Propiedades */
    @Override
    public String obtenerPermisos(){
        return "Permisos de cliente";
    }

    @Override 
    public String mostrarInformacion(){
        return "Permisos: " + obtenerPermisos() + " | Cliente: " + getUsername() + ", Correo: " + getCorreo();
    }
    
}
