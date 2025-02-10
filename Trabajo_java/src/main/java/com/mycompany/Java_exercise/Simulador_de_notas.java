
package com.mycompany.Java_exercise;
import java.util.Scanner;
public class Simulador_de_notas {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.println("Ingrese la nota: ");
           int nota = scanner.nextInt();
           if (nota>=90 && nota<=100){
               System.out.println("Su nota es A");
           }
           else if (nota>=80 && nota<=89){
                System.out.println("Su nota es B");
           }
           else if (nota>=70 && nota<=79){
               System.out.println("Su nota es C");
           }
           else if (nota>=60 && nota<=69){
               System.out.println("Su nota es D");
           }
           else {
             System.out.println("Su nota es F");
           }
    }
}
