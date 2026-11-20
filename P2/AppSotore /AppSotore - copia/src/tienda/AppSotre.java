package tienda;

public class AppSotre {

    private Juegos juegos[];
    private static final int  MAX = 4;

    private int index;

    public AppSotre(){

        juegos= new Juegos[MAX];

        index = 0;

    }

    public int getIndex() {
        return index;
    }

    public void loadData()  {
        // Precargar datos
        addGame(new Juegos("Fifa 2026", "Sports", 16, 50, 20));
        addGame(new Juegos("Roblox", "Action", 5, 75, 10));

    }

    public Juegos[] getJuegos() {
        return juegos;
    }

    public boolean addGame(Juegos j){
        if (j != null && index < MAX){
            juegos[index++]= j;

            return true;
        }

        return false;
    }

    public Juegos searchGame(String name){

        if ( name != null && !name.trim().isEmpty()){
            for(int i = 0; i < index; i++){
                if (juegos[i].getName().equalsIgnoreCase(name)){
                    return juegos[i];
                }
            }
        }

        return null;
    }

    public boolean buyGame(String name, int amount ){

        Juegos j = searchGame(name);
        if( j != null){

            return j.buyLicenses(amount);
        }

        return false;
    }

    public double sellGame(String name, int amount){

        if( name != null && !name.trim().isEmpty() && amount > 0 ){
            Juegos j = searchGame(name);
            if (j != null){
                if (j.sellLicenses(amount)){

                    return j.getPrice() * amount;
                }

            }

        }
        return 0;
    }

    public String bestSeller(){

        String nombre = "";
        int mayor;

        if (index >= 0){
            nombre  = juegos[0].getName();
            mayor  = juegos[0].getLicenciasVendidas();

            for(Juegos j : juegos){
                if (j != null){
                    if (j.getLicenciasVendidas() > mayor){

                        nombre = j.getName();
                        mayor = j.getLicenciasVendidas();

                    }
                } else {
                    break;

                }
            }
        }

        return nombre;
    }


}
