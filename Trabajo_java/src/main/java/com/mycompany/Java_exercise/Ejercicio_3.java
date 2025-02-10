
package com.mycompany.Java_exercise;
import  java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el saldo inicial del ahorrador: ");
        double saldo_inicial=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese el numero de meses: ");
        int meses=scanner.nextInt();
        scanner.nextLine();
        double monto=(0.015*saldo_inicial*meses);
        double saldo_final=saldo_inicial+monto;
        System.out.println("el saldo final equivale a: "+ saldo_final );
        
        
        scanner.close();
    }

}
