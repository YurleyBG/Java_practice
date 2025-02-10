
package com.mycompany.Java_exercise;
import  java.util.Scanner;

public class Cálculo_de_números_pares_e_impares {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        if (numero%2==0){
            System.out.println("el numero es PAR");
        }
        else {
            System.out.println("el numero es IMPAR");
       }
   }
}
