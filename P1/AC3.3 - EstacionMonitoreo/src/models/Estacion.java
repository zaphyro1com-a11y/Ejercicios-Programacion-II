package models;

public class Estacion {
    
    //* Atributos Estaticos */
    private static int totalEstaciones = 0;

    //* Atributos Privados */
    private final int id;
    private String ubicacion;
    private String variable;
    private double lectura;

    //* Constructor */
    public Estacion(String ubicacion, String variable) {
        id = ++totalEstaciones;
        setUbicacion(ubicacion);
        setVariable(variable);
        lectura = 0;
    }

    //* Propiedades */
    public int getId() {
        return id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        if (ubicacion == null || ubicacion.isBlank()) {
            throw new IllegalArgumentException("La ubicacion no puede estar vacia.");
        }
        this.ubicacion = ubicacion.trim();
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        if (variable == null || variable.isBlank()) {
            throw new IllegalArgumentException("La variable no puede estar vacia.");
        }
        this.variable = variable.trim();
    }

    public double getLectura() {
        return lectura;
    }

    public void setLectura(double lectura) {
        if (!Double.isFinite(lectura)) {
            throw new IllegalArgumentException("La lectura debe ser un numero finito.");
        }
        this.lectura = lectura;
    }

    //* Metodos Estaticos */
    public static int getTotalEstaciones(){
        return totalEstaciones;
    }

    //* Metodos */
    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Variable: " + variable);
        System.out.println("Lectura: " + lectura);
    }

    public void actualizarLectura(double nuevaLectura){
        setLectura(nuevaLectura);

    }

}
