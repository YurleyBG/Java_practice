
package com.mycompany.Java_exercise;

import  java.util.Scanner;
public class Simulador_de_alarma_de_peligro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de sensores: ");
        int cantidadSensores = scanner.nextInt();
        
        if (cantidadSensores >= 1 && cantidadSensores <= 2) {
            System.out.println("Alerta baja.");
        } 
        else if (cantidadSensores >= 3 && cantidadSensores <= 5) {
            System.out.println("Alerta media.");
        } 
        else if (cantidadSensores >= 6) {
            System.out.println("Alerta alta.");
        } 
        else {
            System.out.println("Cantidad de sensores no válida.");
        }
    }
}
