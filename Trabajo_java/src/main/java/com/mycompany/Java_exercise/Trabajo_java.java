
package com.mycompany.Java_exercise;
import java.util.Scanner ;

public class Trabajo_java {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la edad");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Cuál es su sexo, Si es masculino ingrese 'M', pero si su sexo es femenino ingrese 'F'.");
        String sexo = scanner.nextLine();
        int hpulsos;
        if (sexo.equalsIgnoreCase("m") | sexo.equalsIgnoreCase("f")) {
            hpulsos = (210 - edad) / 10;
        } else {
            hpulsos = (220 - edad) / 10;
        }
          System.out.println("El número de pulsaciones que usted tiene es de: " + hpulsos);
          
        scanner.close();
        
    }
};

