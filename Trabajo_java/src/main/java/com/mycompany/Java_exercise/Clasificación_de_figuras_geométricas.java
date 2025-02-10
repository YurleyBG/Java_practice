
package com.mycompany.Java_exercise;
import  java.util.Scanner;
public class Clasificación_de_figuras_geométricas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de lados: ");
        int lados = scanner.nextInt();
        
        if (lados== 3) {
            System.out.println("Triangulo.");
        } 
        else if (lados== 4) {
            System.out.println("Cuadrado o rectángulo.");
        } 
        else if (lados== 5) {
            System.out.println("Pentagono.");
        } 
        else if ( lados== 6) {
            System.out.println("Hexágono.");
        } 
        else {
            System.out.println("Mes no válido. Ingrese un número entre 1 y 12.");
        }
    }
}
