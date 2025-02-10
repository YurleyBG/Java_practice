
package com.mycompany.Java_exercise;
import  java.util.Scanner;
public class Calculadora_de_tarifas_de_estacionamiento {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas: ");
         int horas = scanner.nextInt();
         if (horas<=1){
             System.out.println("La tarifa del estacionamiento es de 5");
         }
         else if (horas>=2 && horas<=3){
             System.out.println("La tarifa del estacionamiento es de 10");
         }
         else {
             System.out.println("La tarifa del estacionamiento es de 15");
        }
    }
}
