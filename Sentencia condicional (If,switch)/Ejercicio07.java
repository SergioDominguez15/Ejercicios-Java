public class Ejercicio07 {
  public static void main(String[] args) {

    System.out.println(" ------Programa para Calcular la nota media de 3 notas------ " );
    System.out.print("Por favor, intruce el valor de de tu primera nota ");
    Double n1 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, intruce el valor de de tu segunda nota ");
    Double n2 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, intruce el valor de de tu tercera nota ");
    Double n3 = Double.parseDouble(System.console().readLine());

    Double r = ((n1 + n2 + n3)/3);
    
    System.out.printf(" La nota media es %.2f" , r );
    
    } 
  }

