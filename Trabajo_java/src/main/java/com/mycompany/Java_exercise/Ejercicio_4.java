
package com.mycompany.Java_exercise;

import  java.util.Scanner;
public class Ejercicio_4 {
  public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("ingrese el sueldo base de sus trabajadorex: ");
    double base_saldo = scanner.nextDouble();
    double leyPolitica = base_saldo * 0.01;
    double segSocial = base_saldo * 0.04;
    double segForzado = base_saldo * 0.005;
    double box_Ahorro = base_saldo * 0.05;
  
    double amount_Total = base_saldo - leyPolitica - segSocial - segForzado - box_Ahorro;

    System.out.println("El sueldo base es: " + base_saldo);
    System.out.println("valor a descontar de la ley política: " + leyPolitica);
    System.out.println("valor del seguro social: " + segSocial);
    System.out.println("valor a descontar del seguro forzado: " + segForzado);
    System.out.println("valor de la caja de ahorro: " + box_Ahorro);
    System.out.println("El monto total a pagar es: " + amount_Total);

    scanner.close();
  }
}
