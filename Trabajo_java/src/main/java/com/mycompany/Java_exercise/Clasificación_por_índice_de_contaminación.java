
package com.mycompany.Java_exercise;
import  java.util.Scanner;
public class Clasificación_por_índice_de_contaminación {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese  el índice de calidad del aire (ICA): ");
        int ICA = scanner.nextInt();
        
        if ( ICA >=0 && ICA <= 50 ) {
            System.out.println("Bueno");
        } 
        else if (ICA >= 51 && ICA <= 100 ) {
            System.out.println("Moderado ");
        } 
        else if (ICA >= 101 && ICA <= 150 ) {
            System.out.println("No saludable para grupos sensibles ");
        } 
        else if (ICA>= 151&& ICA <= 200 ) {
            System.out.println("No saludable");
        } 
        else if (ICA >= 201 && ICA <= 300 ) {
            System.out.println("Muy no saludable");
        } 
        else{
            System.out.println("Peligroso");
        } 
    }
}
