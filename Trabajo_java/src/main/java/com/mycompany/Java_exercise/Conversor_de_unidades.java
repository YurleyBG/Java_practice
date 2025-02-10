
package com.mycompany.Java_exercise;

import  java.util.Scanner;
public class Conversor_de_unidades {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la unidad ( 1. Kilómetros a millas, "
                    + "2. Celsius a Fahrenheit, "
                    + "3. Kilogramos a libras):");
            int opcunidad = scanner.nextInt();
            if (opcunidad < 1 || opcunidad > 3) {
                System.out.println("Opción no válida.");
                return; 
            }
            System.out.println("Ingrese la valor a convertir");
            int numero = scanner.nextInt();

            switch(opcunidad){

                case 1 -> {
                   if (numero < 0) {
                    System.out.println("el valor no debe ser negativo");
                    } 
                   else {
                        double millas = numero * 0.621371;
                        System.out.println("Son " + millas + " millas.");
                    }
                }
                case 2 -> {
                    if (numero < 0) {
                    System.out.println("el valor no debe ser negativo");
                    } 
                    else {
                        double Fahrenheit = (numero * 9/5) + 32;
                        System.out.println("Son " + Fahrenheit + " Fahrenheit.");
                    }
                    
                }
                case 3 -> {
                    if (numero < 0) {
                    System.out.println("el valor no debe ser negativo");
                    } 
                    else {
                        double libras = numero* 2.20;
                        System.out.println(" Son " + libras + " libras.");
                    }
                    
                }
            }

        }    
}
