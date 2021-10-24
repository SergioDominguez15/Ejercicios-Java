public class Ejercicio05 {
  public static void main(String[] args) {

    System.out.println(" ------Programa para Calcular solucionar una ecuacion de primer grado ax+b=0------ " );
    System.out.print("Por favor, intruce el valor de a ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, intruce el valor de b ");
    Double b = Double.parseDouble(System.console().readLine());
    

    if ( a == 0 ) {
    System.out.println("Esta ecuacion no tiene solucion");
    } 
    else {
    System.out.println(" x= " + (-b/a));
    
    } 
  }
}
