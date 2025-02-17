
package ejercicios_poo;


public class Herencia {
    class calcular{
      String color;
      int x;
      int y;
        
        public calcular( String color, int x, int y){
            this.color=color;
            this.x=x;
            this.y=y;
        }
        public double calcularArea(){
            return 0;
        
        }
        public String obtenerColor() {
            return color;
        }
    
    }
    
    class rectangulo extends calcular{
        double ancho;
        double altura;
        public rectangulo( String color, int x, int y, double ancho, double altura){
            
            super(color,x,y);
            this.ancho=ancho;
            this.altura= altura;
        }
        
        public double calcularArea(){
            return ancho*altura;
        
        }
        
    }
    
    public static void main(String[] args) {
         
        Herencia herencia = new Herencia();
        rectangulo obtenerArea = herencia.new rectangulo("verde", 2, 20, 5, 8);
        System.out.println("Área del rectángulo: " + obtenerArea.calcularArea()+ " y su color es "+obtenerArea.obtenerColor() );
       
    }
    
}
