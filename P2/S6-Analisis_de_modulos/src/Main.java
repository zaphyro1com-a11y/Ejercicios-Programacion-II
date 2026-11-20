import models.AnalizadorProyecto;
import models.Modulo;

public class Main {
    public static void main(String[] args) {
        
        Modulo modulo1 = new Modulo("Modulo 1", "Java", 100, true);
        Modulo modulo2 = new Modulo("Modulo 2", "Python", 50, false);
        Modulo modulo3 = new Modulo("Modulo 3", "C++", 75, false);

        Modulo[] modulos = {modulo1, modulo2, modulo3};
        AnalizadorProyecto analizador = new AnalizadorProyecto(modulos);

        IO.println("Listado de módulos:\n" + analizador.listarModulos());
        IO.println("Cantidad de módulos terminados: " + analizador.contarTerminados());
        IO.println("Progreso promedio: " + analizador.calcularProgresoPromedio());

        Modulo buscado = analizador.buscarModulo("Modulo 2");
        if (buscado != null) {
            IO.println("Módulo encontrado: " + buscado.mostrarInformacion());
        } else {
            IO.println("Módulo no encontrado");
        }

    }
}
