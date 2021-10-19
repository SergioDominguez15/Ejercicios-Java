public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.println(" ------Programa para Pasar de KB a MB------ " );
    System.out.print("Por favor, introduzca los KB que quieres pasar a MB ");
    double kilobyte = Double.parseDouble(System.console().readLine());
    System.out.println("Son" + (kilobyte/1000) + "MB");
  }
}
