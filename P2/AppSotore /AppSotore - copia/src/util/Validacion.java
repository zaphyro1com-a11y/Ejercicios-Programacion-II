package util;

import java.util.Scanner;

public class Validacion {

    private static Scanner sc= new Scanner(System.in);

    public static String readString(String message){

        String dato;

        do{

            IO.println(message);
            dato = sc.nextLine();

            if(dato == null || dato.trim().isEmpty()){
                IO.println("No soy psiquico, Escribe!");
            }

        }while(dato == null || dato.trim().isEmpty());

        return dato;
    }

}
