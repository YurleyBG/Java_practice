
package com.mycompany.Java_exercise;
import java.util.Scanner;
public class Calculadora_de_descuentos {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.println("Ingrese el precio del producto: ");
           double precio = scanner.nextInt();
           scanner.nextLine();
           System.out.println("Ingrese el el tipo de cliente (A/B/C): ");
           String cliente = scanner.nextLine();
         
           double precio_descuento =0;
           if (cliente.equalsIgnoreCase("A")){
               precio_descuento=precio-(precio*10/100);
           }
           else if (cliente.equalsIgnoreCase("B")){
                precio_descuento=precio-(precio*20/100);
           }
           else {
              precio_descuento=precio-(precio*30/100);
           }
            System.out.println("El precio final con descuento es:  " + precio_descuento); 
    }
}
