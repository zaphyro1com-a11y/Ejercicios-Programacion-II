package models;

public class AnalizadorProyecto {
    
    private Modulo[] modulos;

    public AnalizadorProyecto(Modulo[] modulos) {
        this.modulos = modulos;
    }

    // Devuelve todos los modulos
    public String listarModulos(){

        String informacion = "";

        for(Modulo m : modulos){
            informacion += m.mostrarInformacion();
            
        }

        return informacion;
    }

    public int contarTerminados(){

        int mod_terminados = 0;

        for(Modulo m : modulos){
            if(m.getProgreso() == 100){
                mod_terminados++;

            }
        }

        return mod_terminados;
    }

    public double calcularProgresoPromedio(){
        
        int sum_progresos= 0;
        int num_modulos= 0;

        for (Modulo m : modulos){
            num_modulos++;
            sum_progresos += m.getProgreso();

        }

        return sum_progresos/num_modulos;
    }

    public Modulo buscarModulo(String nombre){

        for(Modulo m : modulos){
            if(m.getNombre().equals(nombre)){
                return m;
            }
        }

        return null;
    }

}
