public class Ejercicio08 {
  public static void main(String[] args) {

    System.out.println(" ------Programa para Calcular Salario semanal------ " );
    System.out.print("Por favor, introduzca el numero total de horas trabajadas esta semana ");
    double horas = Double.parseDouble(System.console().readLine());
    System.out.println("El salario total esta semana es de  " + (horas*12) + "€");
  }
}
