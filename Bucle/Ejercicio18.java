public class Ejercicio18 {
    
    public static void main(String[] args) {

      System.out.print("Introduzca un número: ");
      int numeroUno= Integer.parseInt(System.console().readLine());
      
      System.out.print("Introduzca otro número: ");
      int numeroDos= Integer.parseInt(System.console().readLine());    

        for (int i = numeroUno; i <= numeroDos; i += 7) {
            


            System.out.println( i );
      }          
      }
    }