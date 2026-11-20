package models;

import java.util.ArrayList;

public class Proyecto {

    //* Atributos */
    private String nombre;
    private ArrayList<Desarrollador> desarrolladores;

    //* Constructor */
    public Proyecto(String nombre) {

        this.nombre = nombre;
        desarrolladores = new ArrayList<>();

    }

    //* Metodos */

    public void agregarDesarrollador(Desarrollador desarrollador){

        desarrolladores.add(desarrollador);

    }

    public Desarrollador buscarDesarrollador(String identificacion){

        for (Desarrollador d : desarrolladores){
            if(d.getIdentificacion().equals(identificacion)){
                return d;

            }
        }

        return null;
    }

    public boolean eliminarDesarrollador(String identificacion){

        return desarrolladores.remove(buscarDesarrollador(identificacion));

    }

    public double calcularTotalHoras(){

        int sum_horas= 0;

        for (Desarrollador d : desarrolladores){
            sum_horas += d.getHorasAsignadas();

        }

        return sum_horas;
    }

    public String mostrarEquipo(){

        String equipoInfo = "";

        for (Desarrollador d : desarrolladores){
            equipoInfo += d.mostrarInformacion();

        }

        equipoInfo = (equipoInfo.isEmpty())? "Equipo vacio" : equipoInfo;

        return equipoInfo;
    }

    public String mostrarInfo(){

        return "Proyeto: " + nombre + "\nEquipo: \n" + mostrarEquipo();
    }

}
