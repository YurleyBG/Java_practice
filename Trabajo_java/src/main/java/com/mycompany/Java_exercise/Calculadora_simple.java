
package com.mycompany.Java_exercise;

import  java.util.Scanner;

public class Calculadora_simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el el signo de la operacion (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);
        System.out.println("Ingrese el segundo numero: ");    
        int numero2 = scanner.nextInt();
        
        double resultado=0;
        
        if (operacion=='+') {
        resultado = numero1 + numero2;
        } 
         else if (operacion=='-') {
            resultado = numero1 - numero2;
        } 
         else if (operacion=='*') {
            resultado = numero1 * numero2;
        } 
         else if (operacion=='/') {
              resultado = numero1 / numero2;
        }
        System.out.println("el resultado de su operacion es " + resultado); 
    }
}
