/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_marioocampo;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Examen1_MarioOcampo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        int opcion=0;
        
        while(opcion!=2){
            System.out.println("1. Ejercicio de palabras");
            System.out.println("2. Salir");
            opcion = scanner.nextInt();
            
            if(opcion==1){
                Scanner box = new Scanner(System.in);
                System.out.println("Ingrese la primera cadena: ");
                String cadena1 = box.nextLine();
                System.out.println("Ingrese la segunda cadena: ");
                String cadena2 = box.nextLine();
                
                if(cadena1 == null ? cadena2 != null : !cadena1.equals(cadena2)){
                String nuevaCadena = cadena1+cadena2; 
                System.out.println("Nueva cadena= " +nuevaCadena); 
                }
            }else{
                if(opcion==2){
                    Scanner caja = new Scanner(System.in);
                    System.out.println("Ingrese la primera cadena: ");
                    String primeraCadena = caja.nextLine();
                    System.out.println("Ingrese la segubda cadena: ");
                    String segundaCadena = caja.nextLine();

                    if (primeraCadena.equals(segundaCadena)) {
                        String nuevacadena = new StringBuilder(segundaCadena).reverse().toString();
                        String cadenanueva = primeraCadena+nuevacadena;
                        System.out.println("nueva cadena) " +cadenanueva);
                    }

            }
    //el primero sirve pero el segundo no :( entonces no me ejecuta bien el primero
        }
    }
}
}

