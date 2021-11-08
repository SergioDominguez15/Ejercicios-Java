public class Ejercicio08 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, intruce un numero sin decimales ");
    int n = Integer.parseInt(System.console().readLine());
    
    for (  int multiplo = 1 ; multiplo <=  10; multiplo += 1) {
      System.out.println ( multiplo * n) ;
    }
  }
}
