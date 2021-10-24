public class Ejercicio08 {
  public static void main(String[] args) {

    System.out.println(" ------Programa para Calcular la nota media de 3 notas------ " );
    System.out.print("Por favor, intruce el valor de de tu primera nota ");
    Double n1 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, intruce el valor de de tu segunda nota ");
    Double n2 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, intruce el valor de de tu tercera nota ");
    Double n3 = Double.parseDouble(System.console().readLine());

    Double r = ((n1 + n2 + n3)/3);
    
    if ((r >= 0) && (r < 5)) {
      System.out.printf("Tu nota media es %.2f Insuficiente" , r);
    }  
    if ((r >= 5) && (r < 6)) {
      System.out.printf("Tu nota media es %.2f Suficiente" , r);
    }  
    if ((r >= 6) && (r < 7)) {
      System.out.printf("Tu nota media es %.2f Bien" , r);
    }  
    if ((r >= 7) && (r < 9)) {
      System.out.printf("Tu nota media es %.2f Notable" , r);
    } 
    if ((r >= 9) && (r <= 10)) {
    System.out.printf("Tu nota media es %.2f Excelente" , r);
    } 
  }
}
