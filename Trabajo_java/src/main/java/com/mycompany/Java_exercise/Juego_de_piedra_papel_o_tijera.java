
package com.mycompany.Java_exercise;

import  java.util.Scanner;
public class Juego_de_piedra_papel_o_tijera {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la opcione de jugador 1 ");
        String p1 = scanner.nextLine();
        System.out.println("ingrese la opcion del jugador 2");
        String p2 = scanner.nextLine();
        
        
        if (p1.equalsIgnoreCase("Tijera")&& p2.equalsIgnoreCase("piedra")) {
            System.out.println("el gandor es el jugador 2");
        }
        else if (p1.equalsIgnoreCase("papel")&& p2.equalsIgnoreCase("Tijera")) {
            System.out.println("el gandor es el jugador 2");
        }
        else if (p1.equalsIgnoreCase("piedra")&& p2.equalsIgnoreCase("papel")) {
            System.out.println("el gandor es el jugador 2");
        }
        else if (p1.equalsIgnoreCase(p2)) {
             System.out.println("Hay un empate");
        } 
        else {
            System.out.println("el gandor es el jugador 1");
    }   }
}
