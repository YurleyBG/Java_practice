
package herencia;


public class Herencia {
    public void correr(){
        System.out.println("El perro corre.");
    
    }
    public void volar(){
        System.out.println("El perro no vuela.");
    
    }
    public void comer(){
        System.out.println("El perro come hueso.");
    
    }

    
    public static void main(String[] args) {
       perro Perro = new perro();
       Perro.correr();
       Perro.volar();
       Perro.comer();
       Perro.setNombre("Yurley");
       
       
       perro Perro1 = new perro();
       Perro1.setNombre("maduro");
       Perro1.setEdad(4);
       
       
        System.out.println(Perro1.getNombre());
       
        System.out.println(Perro.getNombre());
    }
    
}
