
package com.mycompany.Java_exercise;

import java.util.Scanner;
public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Escriba cuantas palabras hay en total");
        int palabras = scanner.nextInt();
        System.out.println("Escriba cuantas cm hay en total");
        int cm = scanner.nextInt();
        System.out.println("Escriba cuantas colores hay en total");
        int cantidad_colores = scanner.nextInt();
        
        double PS =palabras*20000;
        double CMS=cm*15000;
        double CRS=cantidad_colores*25000;
        
        double precio=PS+CMS+CRS;
        System.out.println("El precio total es de : $" + precio );
        
        scanner.close();
    }
}
