public class Ejercicio17 {
    public static void main(String[] args) {

      System.out.print("Introduzca un número entero y te dire los 100 siguientes: ");
      int numeroIntroducido = Integer.parseInt(System.console().readLine());

      if (numeroIntroducido >= 0) {
        
        for (int i = numeroIntroducido; i <= (numeroIntroducido+100); i++) {
            
          System.out.println( i );
      }
      } else {
        System.out.println("Tiene que ser un número positivo");
        
      }          
      }
    }

  