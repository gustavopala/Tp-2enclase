public class ProbarPunto{
  public static void main(String [] args){
    Punto punto1 = new Punto();
    Punto punto2 = new Punto(7.5, 0.5);
    
    System.out.println("Coordenadas: "+ punto1.coordenadas());
    
    punto1.desplazar(3, 4);
    
    punto1.mostrar();
    
    punto2.mostrar();
  }
}
