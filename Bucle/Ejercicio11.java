public class Ejercicio11 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    for (int n = numeroIntroducido; n < numeroIntroducido + 5; n++) {
      System.out.printf("%4d %6d %8d\n", n, n * n, n * n * n);
    }
  }
}
