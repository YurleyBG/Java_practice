
package com.mycompany.Java_exercise;

import  java.util.Scanner;
public class Clasificación_de_números_según_divisibilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
       
        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("El número es divisible en 2 y en 3.");
        } 
        else if (numero % 2 == 0) {
            System.out.println("El número es divisible solo por 2.");
        } 
        else if (numero % 3 == 0) {
            System.out.println("El número es divisible solo por 3.");
        } 
        else {
            System.out.println("El número no es divisible ni por 2 ni por 3.");
        }
    }
}
