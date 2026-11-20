import models.Desarrollador;
import models.Proyecto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList <Desarrollador> desarrolladores = new ArrayList<>(); 
        
        desarrolladores.add(new Desarrollador("0001", "Gabo", "Frontend", 60.5));
        desarrolladores.add(new Desarrollador("0002", "Dany", "FrontEnd", 25.0));
        desarrolladores.add(new Desarrollador("0003", "Matheo", "BackEnd", 50.0));
        desarrolladores.add(new Desarrollador("0004", "Leo", "BackEnd", 30.5));

        Proyecto proyectoNuevo = new Proyecto("P001");

        proyectoNuevo.agregarDesarrollador(desarrolladores.get(0));
        proyectoNuevo.agregarDesarrollador(desarrolladores.get(3));

        IO.println(proyectoNuevo.mostrarInfo());

        Desarrollador desarrollador_buscado = proyectoNuevo.buscarDesarrollador("0002");

        if (desarrollador_buscado == null){
            IO.println("No se encontro el desarrollador");

        }else{
            IO.println(desarrollador_buscado.mostrarInformacion());

        }
        

    }
}
