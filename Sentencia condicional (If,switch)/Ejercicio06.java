public class Ejercicio06 {
  public static void main(String[] args) {

    System.out.println(" ------Programa para Calcular el tiempo que tarda en caer un objeto------ " );
    System.out.print("Por favor, intruce el valor de la altura en metros (m) ");
    Double h = Double.parseDouble(System.console().readLine());
    

    if ( h <= 0 ) {
    System.out.println("Con estos datos no hay solucion");
    } 
    else {
      double r = Math.sqrt((2*h)/9.81);
    System.out.printf(" Tarda %.4f segundos" , r );
    
    } 
  }
}
