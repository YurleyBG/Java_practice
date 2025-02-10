
package com.mycompany.Java_exercise;

import java.util.Scanner;
public class Clasificación_de_triángulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.println("Ingrese el lado 1: ");
           int lado1 = scanner.nextInt();
           System.out.println("Ingrese el lado 2: ");
           int lado2 = scanner.nextInt();
           System.out.println("Ingrese el lado 3: ");
           int lado3 = scanner.nextInt();
           
           if (lado1==lado2 && lado2==lado3){
               System.out.println("su triangulo es Equilátero");
           }
           else if (lado1==lado2 || lado1==lado3 || lado2==lado3){
                System.out.println("su triangulo es Isósceles");
           }
           else {
             System.out.println("su triangulo es Escaleno");
           }
    }
}
