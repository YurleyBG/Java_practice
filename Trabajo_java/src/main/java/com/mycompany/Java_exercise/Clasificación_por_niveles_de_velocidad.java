
package com.mycompany.Java_exercise;
import  java.util.Scanner;
public class Clasificación_por_niveles_de_velocidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la velocidad del vehículo: ");
        int velocidad = scanner.nextInt();
       
        if (velocidad >= 0 && velocidad <= 20) {
            System.out.println(" Muy lento");
        } 
        else if (velocidad >= 21 && velocidad <= 60) {
            System.out.println("Moderado");
        } 
        else if (velocidad >= 61 && velocidad <= 120) {
            System.out.println("Rápido");
        } 
        else if (velocidad > 120) {
            System.out.println("Muy rápido");
        } 
        else {
            System.out.println("Valor de velocidad no válido.");
        }
    }
}
