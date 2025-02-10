
package com.mycompany.Java_exercise;

import  java.util.Scanner;
public class Calculador_de_IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su peso en kilogramos: ");
        int peso = scanner.nextInt();
        System.out.println("Ingrese su altura en metros ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        
        if (imc < 18.5) {
            System.out.println(imc+"Bajo peso");
        } 
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println(imc+"Peso normal");
        } 
        else if (imc >= 25 && imc <= 29.9) {
            System.out.println(imc+"Sobrepeso");
        } 
        else {
            System.out.println(imc+"Obesidad");
        }
    }
}
