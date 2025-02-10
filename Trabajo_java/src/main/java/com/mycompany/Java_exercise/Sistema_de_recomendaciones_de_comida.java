
package com.mycompany.Java_exercise;

import  java.util.Scanner;
public class Sistema_de_recomendaciones_de_comida {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el clima (soleado, lluvioso, frío):");
            String clima = scanner.nextLine().toLowerCase();
            System.out.println("Ingrese la hora (mañana, tarde, noche)::");
            String hora = scanner.nextLine().toLowerCase();

            switch(clima){

                case "soleado" -> {
                    if (hora.equals("mañana")) {
                        System.out.println("jugo de naranja y huevo revueltos con tostada");
                    } else if (hora.equals("tarde")) {
                        System.out.println("arroz mixto");
                    } else if (hora.equals("noche")) {
                        System.out.println("hamburguesa con papas");
                    }
                }
                case "lluvioso" -> {
                    if (hora.equals("mañana")) {
                        System.out.println("cafe de leche y huevo revueltos con tostada");
                    } else if (hora.equals("tarde")) {
                        System.out.println("ensalada de atun");
                    } else if (hora.equals("noche")) {
                        System.out.println("jugo de fresa con tostadas");
                    }
                }
                case "frío" -> {
                    if (hora.equals("mañana")) {
                        System.out.println("cafe de leche y huevo revueltos con tostada");
                    } else if (hora.equals("tarde")) {
                        System.out.println("caldo de pollo");
                    } else if (hora.equals("noche")) {
                        System.out.println("chocolate caliente con pan");
                    }
                }
            }

        }    
}
