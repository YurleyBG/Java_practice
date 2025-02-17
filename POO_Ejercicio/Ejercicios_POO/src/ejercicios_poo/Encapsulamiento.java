
package ejercicios_poo;


public class Encapsulamiento {
    
    String nombre;
    private String Password; 
    
    
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public static void main(String[] args) {
         
        Encapsulamiento e = new Encapsulamiento();
        e.nombre="pepito";
        e.setPassword("pepito122");
        System.out.println( "el nombre es "+ e.nombre  + " y su contraseña es " + e.getPassword());
        
       
       
    }
}
