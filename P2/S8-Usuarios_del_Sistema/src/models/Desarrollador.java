package models;

public class Desarrollador extends Usuario {
    
    //* Constructor */
    public Desarrollador(String username, String correo) {
        super(username, correo);
    }

    //* Propiedades */
    @Override
    public String obtenerPermisos(){
        return "Permisos de desarrollador";
    }

    @Override 
    public String mostrarInformacion(){
        super.mostrarInformacion();
        return "Permisos: " + obtenerPermisos() + " | Desarrollador: " + getUsername() + ", Correo: " + getCorreo();
    }
    
}
