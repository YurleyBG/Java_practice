
package com.mycompany.Java_exercise;
import java.util.Scanner;
public class Ejercicio_6 {
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingresar la cantidad de años laborados");
        int years;
        int bn1;
        int bnfinal;
        years= scanner.nextInt();
        
        if(years>=1){
            bn1=100000;
            bnfinal=((years+1)*120000)+bn1;
            System.out.println("El bono a pagar es de: " + bnfinal);
        } else {
            System.out.println("El bono a pagar es de: 100000");
        }
        scanner.close();
    }
}
