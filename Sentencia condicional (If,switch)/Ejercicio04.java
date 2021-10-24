public class Ejercicio04 {
  public static void main(String[] args) {

    System.out.println(" ------Programa para Calcular Salario semanal------ " );
    System.out.print("Por favor, introduzca el numero total de horas trabajadas esta semana ");
    int n = Integer.parseInt(System.console().readLine());
    
    if ((n >= 1) && (n <= 40)) {
    System.out.println("El salario de esta semana es " + (n*12) + "€");
    }
    
    if ((n >= 41)) {
    System.out.println("El salario de esta semana es " + (40*12 +(n-40)*16) + "€");
    } 
  }
}
