
package ejercicios_poo;

public class Polimorfismo {
    
    class vehiculos_llantas {
        
        int Cantidad_llantas = 4;
        
        public void llantas(){
            System.out.println("El carro tiene " + Cantidad_llantas + " llantas.");
        }  
    }
    
    class bicicleta extends vehiculos_llantas {
        public bicicleta(int cantidad_llantas) {
            this.Cantidad_llantas = cantidad_llantas;
        }

        @Override
        public void llantas() {
            System.out.println("La bicicleta tiene " + Cantidad_llantas + " llantas.");
        }
    }  
    
    public static void main(String[] args) {
        Polimorfismo polimorfismo = new Polimorfismo();
        bicicleta obtenerLlanta = polimorfismo.new bicicleta(2);
        obtenerLlanta.llantas();
    }
}
