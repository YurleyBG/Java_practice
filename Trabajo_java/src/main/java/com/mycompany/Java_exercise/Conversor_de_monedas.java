
package com.mycompany.Java_exercise;

import  java.util.Scanner;
public class Conversor_de_monedas {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la la moneda ( 1. Euros"
                    + "2. Pesos Colombianos"
                    + "3. Yenes):");
            int moneda = scanner.nextInt();
            if (moneda < 1 || moneda > 3) {
                System.out.println("Opción no válida.");
                return; 
            }
            System.out.println("Ingrese la valor a convertir");
            int numero = scanner.nextInt();

            switch(moneda){

                case 1 -> {
                   if (numero < 0) {
                    System.out.println("el valor no debe ser negativo");
                    } 
                   else {
                        double Euros = numero * 0.85;
                        System.out.println("Son " + Euros );
                    }
                }
                case 2 -> {
                    if (numero < 0) {
                    System.out.println("el valor no debe ser negativo");
                    } 
                    else {
                        double Pesos_Colombianos = numero * 4100;
                        System.out.println("Son " + Pesos_Colombianos );
                    }
                    
                }
                case 3 -> {
                    if (numero < 0) {
                    System.out.println("el valor no debe ser negativo");
                    } 
                    else {
                        double Yenes = numero* 110;
                        System.out.println(" Son " + Yenes );
                    }
                    
                }
            }

        }    
}
