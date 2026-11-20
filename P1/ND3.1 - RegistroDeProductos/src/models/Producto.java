package models;

public class Producto {
    
    //* Atributos Privados */
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private static int contadorProductos = 0;

    //* Constructor */
    public Producto(String nombre, double precio, int stock) {
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
        this.id = ++contadorProductos;
    }

    //* Propiedades */
    public int getId() {
        return id;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (!Double.isFinite(precio) || precio < 0) {
            throw new IllegalArgumentException("El precio debe ser un número válido y no negativo.");
        }
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stock = stock;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    //* Metodos */
    public void mostrarInformacion(){

        IO.println("ID: " + id);
        IO.println("Nombre: " + nombre);
        IO.println("Precio: $" + precio);
        IO.println("Stock: " + stock);
        IO.println();

    }

}
