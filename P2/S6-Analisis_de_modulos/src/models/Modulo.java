package models;

public class Modulo {

    private String nombre;
    private String lenguaje;
    private int progreso;
    private boolean terminado;

    public Modulo(String nombre, String lenguaje, int progreso, boolean terminado) {
        
        setNombre(nombre);
        setLenguaje(lenguaje);
        setProgreso(progreso);
        this.terminado = terminado;

    }

    public String getNombre(){
        return nombre;
    }

    public int getProgreso(){
        return progreso;
    }

    public boolean isTerminado(){
        return terminado;
    }

    public String mostrarInformacion(){
        
        return "Modulo: " + nombre + ", Lenguaje: " + lenguaje + ", Progreso: " + progreso + "%, Terminado: " + terminado + "\n";
    }

    private void setNombre(String nombre){
        if(nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }

        this.nombre = nombre;
    }

    private void setLenguaje(String lenguaje){
        if(lenguaje == null || lenguaje.isEmpty()){
            throw new IllegalArgumentException("El lenguaje no puede ser nulo o vacío");
        }

        this.lenguaje = lenguaje;
    }

    private void setProgreso(int progreso){
        if(progreso < 0 || progreso > 100){
            throw new IllegalArgumentException("El progreso debe estar entre 0 y 100");
        }

        this.progreso = progreso;
    }

}
