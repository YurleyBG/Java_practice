
package com.mycompany.Java_exercise;
import  java.util.Scanner;
public class Clasificación_de_edades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.println("Ingrese la edad: ");
           int edad = scanner.nextInt();
           if (edad==0 && edad<=12){
               System.out.println("Es un niño");
           }
           else if (edad>=13 && edad<=17){
               System.out.println("Es un adolecente");
           }
           else if (edad>=18 && edad<=59){
               System.out.println("Es un adulto");
           }
          else {
               System.out.println("Es Adulto mayor");
           }
    }
}
