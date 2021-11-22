public class Ejercicio01 {
    public static void main(String[] args) {
        
        int suma =  0;
        int tirada;

    for (int i = 0; i < 3; i++) {
          tirada = (int)(Math.random()*6 +1);
          suma += tirada;
          System.out.println(tirada);     
      }
            System.out.println( "La suma es " + suma);         
    }
  }