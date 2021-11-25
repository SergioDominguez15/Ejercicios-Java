public class Ejercicio09 {
  public static void main(String[] args) {
    
    int aleatorio = 0 ;
    int veces = 0;
    System.out.println("Numeros aleatorios del 0 al 100 hasta que salga el 24");
    do {
      aleatorio = (int)(Math.random() * 51) * 2;
      System.out.print( aleatorio + " ");
      veces++;
    } while (aleatorio != 24);
    
    System.out.println("\nSe han generado " + veces + " numeros hasta el 24 ");

    
  }
}
