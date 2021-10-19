public class Ejercicio10 {
  public static void main(String[] args) {

    System.out.println(" ------Programa para Pasar de MB a KB------ " );
    System.out.print("Por favor, introduzca los MB que quieres pasar a KB ");
    double megabyte = Double.parseDouble(System.console().readLine());
    System.out.println("Son" + (megabyte*1000) + "KB");
  }
}
