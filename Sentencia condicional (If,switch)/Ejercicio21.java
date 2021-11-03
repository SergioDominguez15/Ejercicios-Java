public class Ejercicio21 {
  public static void main(String[] args) {

    System.out.println(" ------Programa para calcular la nota de un trimestre  ------ " );
    System.out.print("Por favor, intruce el valor de de tu primera nota de programacion ");
    Double n1 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, intruce el valor de de tu segunda nota de programacion ");
    Double n2 = Double.parseDouble(System.console().readLine());



    Double r = ((n1 + n2)/3);
    
    if ((r >= 5) && (r <= 10)) { 
      System.out.println(" La nota del primer control: " + n1 );
      System.out.println(" La nota del segundo control: " + n2 );
      System.out.printf(" Tu nota de programacion es %.2f" , r );
      }
    
    if (r < 5) { 
      System.out.print("Por favor, intruce ¿Cual ha sido el resultado de la recuperacion? (apto /no apto) ");
      String recuperacion  = System.console().readLine();
 
      if (recuperacion.equals("apto")) {
        System.out.println(" La nota del primer control: " + n1 );
        System.out.println(" La nota del segundo control: " + n2 );
        System.out.println(" ¿Cual ha sido el resultado de la recuperacion? (apto/no apto) " + recuperacion );
        System.out.printf(" Tu nota de programacion es un 5" );
        }
        
      if (recuperacion.equals("no apto")) {
          System.out.println(" La nota del primer control: " + n1 );
          System.out.println(" La nota del segundo control: " + n2 );
          System.out.println(" ¿Cual ha sido el resultado de la recuperacion? (apto/no apto) " + recuperacion );
          System.out.printf(" Tu nota de programacion es %.2f" , r );
          
        }
      }
    } 
  }

