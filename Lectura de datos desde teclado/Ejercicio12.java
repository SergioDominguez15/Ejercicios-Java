public class Ejercicio12 {
  public static void main(String[] args) {

    System.out.println("------Programa para calcular nota que hace falta------");
    System.out.print("Por favor, introduzca la nota del primer examen ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("¿Que nota quieres sacar en el trimestre? ");
    double notatrimestre = Double.parseDouble(System.console().readLine());
    System.out.println("Para sacar un " + notatrimestre + " en el trimestre necesitas sacar un" + ((notatrimestre - 0.4*nota1)/0.6) + " En el segundo examen" );
  }
}
