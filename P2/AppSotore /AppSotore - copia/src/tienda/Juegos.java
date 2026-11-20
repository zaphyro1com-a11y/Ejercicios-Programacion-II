package tienda;

public class Juegos {

    // ATRIBUTOS
    private String name;
    private String tag;
    private int size;
    private int licenciasDisponibles;
    private int licenciasVendidas;
    private double price;

    // BUILDER
    public Juegos(String name, String tag, int size, int licenciasDisponibles, double price) {
        this.name = name;
        this.tag = tag;
        this.size = size;
        this.licenciasDisponibles = licenciasDisponibles;
        this.licenciasVendidas = 0;
        this.price = price;
    }

    // PROPIEDADES
    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    public int getSize() {
        return size;
    }

    public int getLicenciasDisponibles() {
        return licenciasDisponibles;
    }

    public int getLicenciasVendidas() {
        return licenciasVendidas;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        if (name != null &&  !name.trim().isEmpty() ){
            this.name = name;
        }
    }

    public void setTag(String tag) {
        if (tag != null && !tag.trim().isEmpty() ){
            this.tag = tag;

        }
    }

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        }
    }

    public void setPrice(double price) {
        if (size > 0) {
            this.price = price;
        }
    }

    // METODOS
    public boolean buyLicenses(int amount){
        if(amount > 0){
            licenciasDisponibles += amount;

            return true;
        }

        return false;
    }

    public boolean sellLicenses(int amount){
        if (amount > 0 && amount < licenciasDisponibles){
            licenciasDisponibles -= amount;
            licenciasVendidas += amount;

            return true;
        }

        return false;
    }


    @Override
    public String toString() {
        return name;

    }
}
