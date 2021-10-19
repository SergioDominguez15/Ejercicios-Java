public class Ejercicio09 {
  public static void main(String[] args) {

    System.out.println("-----Calcular Volumen de un cono------");
    System.out.print("Por favor, introduzca el radio del cono (cm): ");
    double radio = Double.parseDouble(System.console().readLine());
    System.out.print("Inroduzca la altura (cm): ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("El volumen del cono es " + ( (1.0/3) * 3.14 * (radio * radio) * altura) + " cm³");
  }
}
