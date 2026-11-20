package models;

public class Desarrollador {
    
    //* Atributos */
    private String identificacion;
    private String nombre;
    private String especialidad;
    private double horasAsignadas;

    //* Constructor */
    public Desarrollador(String identificacion, String nombre, String especialidad, double horasAsignadas) {
        
        setIdentificacion(identificacion);
        setNombre(nombre);
        setEspecialidad(especialidad);
        setHorasAsignadas(horasAsignadas);

    }

    //* Propiedades */
    public String getIdentificacion(){return identificacion;}

    public double getHorasAsignadas(){return horasAsignadas;}

    private void setIdentificacion(String identificacion){

        if(identificacion == null || identificacion.isEmpty()){
            throw new IllegalArgumentException("Ingrese una identificacion valida");

        }

        this.identificacion = identificacion;
    }

    private void setNombre(String nombre){

        if(nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre del Desarrollador no puede estar vacio");

        }

        this.nombre = nombre;
    }

    private void setEspecialidad(String especialidad){

        if(especialidad == null || especialidad.isEmpty()){
            throw new IllegalArgumentException("La especialidad del desarrollador no puede estar vacía");

        }

        this.especialidad = especialidad;
    }

    private void setHorasAsignadas(double horasAsignadas){

        if(horasAsignadas < 0){
            throw new IllegalArgumentException("Las horas asignadas no pueden ser menos de 0 horas");

        }

        this.horasAsignadas = horasAsignadas;
    }

    //* Metodos */
    public String mostrarInformacion(){

        return "ID: " + identificacion + ", Nombre: " + nombre + ", Especialidad: " + especialidad + ", Horas Asignadas: " + horasAsignadas + "\n";
    }

}
