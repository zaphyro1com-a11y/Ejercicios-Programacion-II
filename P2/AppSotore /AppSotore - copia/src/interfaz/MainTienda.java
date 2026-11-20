package interfaz;

import tienda.Juegos;
import tienda.AppSotre;
import util.Validacion;

import javax.swing.*;
import java.util.Scanner;


public class MainTienda {
    private static AppSotre tienda = new AppSotre();
    private static Scanner sc = new Scanner(System.in);

    static void main(){

        int opc;
        tienda.loadData();

        do{

            menu();
            opc=  Integer.parseInt(sc.nextLine());

            switch (opc){

                case 1:{
                    addGames();

                } break;
                case 2:{
                    getInfo();

                } break;
                case 3:{

                } break;
                case 4:{

                } break;
                case 5:{

                } break;
                case 6:{

                } break;
                default:{
                    IO.print("No Es una Opcion Valida\n");
                }

            }

        }while(opc != 7);

    }

    public static  void menu(){
        System.out.println("**********AppStore Udla**********");
        System.out.println("1. Ingresar Juego");
        System.out.println("2. Mostrar juegos");
        System.out.println("3. Buscar juego");
        System.out.println("4. Comprar");
        System.out.println("5. Vender");
        System.out.println("6. Juego más vendido");
        System.out.println("7. Salir");
        System.out.print("Ingrese una opcion: ");
    }

    public static void addGames(){

        System.out.println("*******Ingreso de datos********");
        String name = Validacion.readString("Ingrese el nombre: ");
        String tag = Validacion.readString("Ingrese la categoria: ");
        Validacion.readString("Ingrese el tamanio: ");
        int size = Integer.parseInt(Validacion.readString("Ingrese el tamanio: "));
        int price = Integer.parseInt(Validacion.readString("Ingrese el precio: "));
        int licenciasDisponibles = Integer.parseInt(Validacion.readString("Ingrese el stock inicial: "));

        if (tienda.addGame(new Juegos(name, tag, size, price, licenciasDisponibles))){
            //JOptionPane.showMessageDialog(null, "El juego se ha agregado con exito");
            IO.println("El juego se ha agregado con exito");

        }else {
            //JOptionPane.showMessageDialog(null, "El juego no se ha agregado con exito");
            IO.println("El juego no se ha agregado ");

        }

    }

    public static void getInfo(){

        Juegos juegos[] = tienda.getJuegos();

        if (tienda.getIndex() == 0){
            IO.println("No existen juegos aun");

        }

        for (Juegos j : juegos){
            IO.println(j);

        }

    }

}
