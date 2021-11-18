public class Ejercicio17 {
    public static void main(String[] args) {

      System.out.print("Introduzca un número entero y te dire los 100 siguientes: ");
      int numeroIntroducido = Integer.parseInt(System.console().readLine());

        
        for (int i = numeroIntroducido; i < i+100; i++) {

            System.out.println( i );
        }

        
      }
    }

  