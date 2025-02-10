
package com.mycompany.Java_exercise;

import  java.util.Scanner;
public class Conversor_de_edades_caninas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la edad de su perro: ");
        int edad = scanner.nextInt();
        
        double edad_canina_humana;
        if (edad<=2) {
            edad_canina_humana=  edad*10.5;
        } 
        else{
            edad_canina_humana=21 + (edad - 2) * 4;
        } 
        
        System.out.println("la edad de su mascota corresponde a "+ edad_canina_humana + "años humanos");
        
    }
}
