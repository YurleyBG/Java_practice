/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;


public class polimorfismo {
    int id;
    String Nombre;
    String Apellido;
    
    public void Sonido(){
        System.out.println("grr");
    }
    
    public void estudiante(){
        System.out.println("No hay parametros");
    }
    public void estudiante(int id, String Nombre){
        System.out.println("Esta funcion recibe dos parametros");
    }
    public void estudiante(int id, String Nombre,String Apellido){
        System.out.println("Esta funcion recibe tres parametros");
    }
    
    
    
    
}
