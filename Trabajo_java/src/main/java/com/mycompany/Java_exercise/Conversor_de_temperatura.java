
package com.mycompany.Java_exercise;
import java.util.Scanner;
public class Conversor_de_temperatura {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura: ");
        int temperatura = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la unidad(C/F): ");
        String unidad = scanner.nextLine();
        
        double resultado=0;
        String unidades = "";
        if (unidad.equalsIgnoreCase("C")){
            resultado= (temperatura * 9/5) + 32;
            unidades = "F";
        }
        else if (unidad.equalsIgnoreCase("F")){
            resultado= (temperatura - 32) * 5/9;
            unidades = "C";
        }
        System.out.println("La temperatura es:  " + resultado + " " + unidades);
 
    }   
    
}
