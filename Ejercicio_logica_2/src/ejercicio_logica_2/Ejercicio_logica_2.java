
package ejercicio_logica_2;

import java.util.*;
public class Ejercicio_logica_2 {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        boolean e = verificar(s); 
        System.out.println(e);
    }

    public static boolean verificar(String s) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char caracter = s.charAt(i);

           switch(caracter){
               case '{':
                   pila.push(caracter);
                   break;
               case '[':
                   pila.push(caracter);
                   break;
                   
               case '(':
                    pila.push(caracter);
                   break;
               case '}':
                   System.out.println(pila);
                   if(pila.empty()||pila.pop()!='{'){
                       return false;  
                   }
                break;
                case ']':
                   if(pila.empty()||pila.pop()!='['){
                       return false;  
                   }
                break;
                case ')':
                   if(pila.empty()||pila.pop()!='('){
                       return false;  
                   }
                break;
                
                   
           
           }
        }
        return pila.isEmpty(); 
        
    }
}