
package com.mycompany.Java_exercise;
import  java.util.Scanner;
public class Determinación_de_rango_etario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();
        
        if (edad >= 0 && edad <= 2) {
            System.out.println("Es un bebé.");
        } 
        else if (edad >= 3 && edad <= 12) {
            System.out.println("Es un niño.");
        } 
        else if (edad >= 13 && edad <= 17) {
            System.out.println("Es un adolescente.");
        } 
        else if (edad >= 18 && edad <= 64) {
            System.out.println("Es un adulto.");
        } 
        else if (edad >= 65) {
            System.out.println("Es un adulto mayor.");
        } 
        else {
            System.out.println("Edad no válida.");
        }
    }
}
