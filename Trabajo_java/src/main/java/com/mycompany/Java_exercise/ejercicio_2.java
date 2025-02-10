
package com.mycompany.Java_exercise;
import java.util.Scanner;
public class ejercicio_2 {
    public static void main(String[] args) {
       System.out.println(" Ahora ingresar la cantidad a invertir de cada una");
       Scanner scanner = new Scanner(System.in);
       System.out.println(" ingrese la cantidad a invertir de la persona 1");
       int persona1= scanner.nextInt();
       scanner.nextLine();
       System.out.println(" ingrese la cantidad a invertir de la persona 2");
       int persona2= scanner.nextInt();
       scanner.nextLine();
       System.out.println(" ingrese la cantidad a invertir de la persona 3");
       int persona3= scanner.nextInt();
       int inversion_Total = persona1+persona2+persona3;
       double porcentaje_P1=persona1*100/inversion_Total;
       double porcentaje_P2=persona2*100/inversion_Total;
       double porcentaje_P3=persona3*100/inversion_Total;
       System.out.println("El porcentaje que invierte la 1ra persona es de :" + porcentaje_P1 + "%");
       System.out.println("El porcentaje que invierte la 2ra persona es de :" + porcentaje_P2 + "%");
       System.out.println("El porcentaje que invierte la 3ra persona es de :" + porcentaje_P3 + "%" );
       
       scanner.close();
    }
}
