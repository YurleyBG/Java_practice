
package com.mycompany.Java_exercise;

import  java.util.Scanner;
public class Determinador_de_estación_del_año {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el numero del mes: ");
     int mes = scanner.nextInt();
     
     if ( mes==5 ||  mes==3){
         System.out.println("la estacion es Primavera");
     }
     else if (mes==8 ||  mes==6){
         System.out.println("la estacion es Verano");
     }
     else if(mes==11 ||  mes==9){
         System.out.println("la estacion es Otoño");
     }
     else if (mes==12 || mes==2){
         System.out.println("la estacion es Invierno ");
     }
   }
}
