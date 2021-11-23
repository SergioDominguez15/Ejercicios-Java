public class Ejercicio04 {
    public static void main(String[] args) {
        
        int suma =  0;
        int tirada;

    for (int i = 0; i < 20; i++) {
          tirada = (int)(Math.random()*10);
          suma += tirada;
          System.out.print(tirada + "  ");     
      }    
    }
  }