package models;

import java.util.ArrayList;

public class SistemaUsuarios {
    
    //* Atributos */
    private ArrayList<Usuario> usuarios;

    //* Constructor */
    public SistemaUsuarios() {
        usuarios = new ArrayList<>();
    }

    //* Métodos */
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuario(String username){
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {
                return usuario;
            }
        }
        return null; 
    }

    public boolean eliminarUsuario(String username){
        Usuario usuario = buscarUsuario(username);
        if (usuario != null) {
            usuarios.remove(usuario);
            return true;
        }
        return false;
    }

    public String mostrarUsuarios(){
        StringBuilder sb = new StringBuilder();
        for (Usuario usuario : usuarios) {
            sb.append(usuario.mostrarInformacion()).append("\n");
        }
        return sb.toString();
    }

}
