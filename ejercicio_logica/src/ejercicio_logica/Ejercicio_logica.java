/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_logica;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Ejercicio_logica {

    
    public static void main(String[] args) {
       
        
        Scanner scan =new Scanner(System.in);
        int N=scan.nextInt();
        List<Integer> L = new ArrayList<>();
        for(int i=0; i<N; i++){
            int numeros=scan.nextInt();
            L.add(numeros);
        }
        StringBuilder separar = new StringBuilder();
        for (int j = 0; j < L.size(); j++) {


           separar.append(L.get(j)).append(" ");


        }
        System.out.println(separar); 
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            if (i % 2 == 0) {
                System.out.println("Insert");
                int x = scan.nextInt();
                System.out.print("");
                int y = scan.nextInt();
                if(x<L.size()){
                    L.set(x, y);
                }
                else{
                    L.add(y);
                }
            } else {
                System.out.println("Delete");
               
                int x=scan.nextInt();
                for (int j = 0; j < L.size(); j++) {
                    if(j==x){
                        L.remove(j);
                    }                   
                }
                StringBuilder separ = new StringBuilder();
                for (int j = 0; j < L.size(); j++) {
                   
                  
                   separ.append(L.get(j)).append(" ");
                  
                    
                }
                System.out.println(separ); 
            }
        }  
        

        
    
        
    }
    
}
