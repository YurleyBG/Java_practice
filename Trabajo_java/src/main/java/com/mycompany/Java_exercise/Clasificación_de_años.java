
package com.mycompany.Java_exercise;

import  java.util.Scanner;

public class Clasificación_de_años {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el año: ");
         int año = scanner.nextInt();
         if ((año%4==0 && año%100!=0)||año%400==0){
              System.out.println(año + " es un año bisiesto.");
         }
         else {
              System.out.println(año + " No es un año bisiesto.");
         }
    }
}
