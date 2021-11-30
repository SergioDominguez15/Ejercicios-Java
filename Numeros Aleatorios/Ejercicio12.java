public class Ejercicio12 {
  public static void main(String[] args) {
    
    int dadouno = 0 ;
    int dadodos = 0;
    System.out.println("Tirada de dados hasta que salgan iguales");
    do {
      dadouno = (int)(Math.random() * 6 + 1) ;
      dadodos = (int)(Math.random() * 6 + 1) ;
      System.out.println( dadouno + " y " + dadodos);
    } while (dadouno != dadodos);
    


    
  }
}
