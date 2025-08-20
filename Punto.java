
/**
 * Write a description of class Punto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto{
  private double x;
  private double y;
  
  public Punto(){
    setX(0);
    setY(0);
  }
  
  public Punto(double p_x, double p_y){
    setX(p_x);
    setY(p_y);
  }
  
  public double getX(){ return x; }
  
  public double getY(){ return y; }
  
  private void setX( double p_x ) { x = p_x; }
  
  private void setY( double p_y ) { y = p_y; }
  
  public void desplazar (double p_dx, double p_dy){
    setX(getX() + p_dx);
    setY(getY() + p_dy);
  }
  
  public void mostrar (){
    System.out.println("Punto. X: " + getX() +", Y: " + getY());
  }
  
  public String coordenadas (){
    return "("+getX() +", " + getY()+")";
  }
}
