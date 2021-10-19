public class Ejercicio03 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la cantidad de pesetas que quiere convertir: ");
    int pesetas = Integer.parseInt(System.console().readLine());

    double euros = pesetas / 166.386;

    System.out.printf("%d pesetas son %.2f euros.", pesetas, euros);
  }
}
