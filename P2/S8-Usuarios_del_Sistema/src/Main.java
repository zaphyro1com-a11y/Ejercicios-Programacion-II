import models.Administrador;
import models.Cliente;
import models.Desarrollador;
import models.SistemaUsuarios;
import models.Usuario;

public class Main {
    public static void main(String[] args) {
        
        Usuario u1 = new Administrador("admin1", "admin@demo.com");
        Usuario u2 = new Desarrollador("dev1", "dev@demo.com");
        Usuario u3 = new Cliente("cliente1", "cliente@demo.com");

        SistemaUsuarios sistema = new SistemaUsuarios();

        sistema.agregarUsuario(u1);
        sistema.agregarUsuario(u2);
        sistema.agregarUsuario(u3);
        
        //System.out.println(sistema.mostrarUsuarios());
        IO.println(u2.mostrarInformacion());

    }
}
