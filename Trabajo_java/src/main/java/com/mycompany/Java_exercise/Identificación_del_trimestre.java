
package com.mycompany.Java_exercise;

import  java.util.Scanner;
public class Identificación_del_trimestre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número del mes: ");
        int mes = scanner.nextInt();
        
        if (mes >= 1 && mes <= 3) {
            System.out.println("Pertenece al Primer trimestre.");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("Pertenece al Segundo trimestre.");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("Pertenece al Tercer trimestre.");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("Pertenece al Cuarto trimestre.");
        } else {
            System.out.println("Mes no válido. Ingrese un número entre 1 y 12.");
        }
    }
    
}
