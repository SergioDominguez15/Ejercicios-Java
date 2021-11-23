public class Ejercicio05 {
    public static void main(String[] args) {
        int suma = 0 ;
        int maximo = 199 ;
        int minimo = 100 ;  
        int tirada;

    for (int i = 0; i < 50; i++) {
          tirada = (int)(Math.random()*100 + 100);
          suma += tirada;
          System.out.print(tirada + "  "); 
          
      }
    int media = (suma / 50) ;   
    System.out.println(" ");   
    System.out.println("El maximo es " + maximo + " y el minimo es " + minimo + " y la media es " + media);         
    }
  }