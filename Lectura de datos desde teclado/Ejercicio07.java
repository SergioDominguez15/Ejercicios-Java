public class Ejercicio07 {
  public static void main(String[] args) {

    System.out.println(" ------Programa para Calcular Factura total------ " );
    System.out.print("Por favor, introduzca el total de la factura sin IVA: ");
    double factura = Double.parseDouble(System.console().readLine());
    System.out.println("El Total de la factura es " + (factura*1.21) + "€");
  }
}
