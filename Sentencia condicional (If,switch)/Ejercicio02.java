public class Ejercicio02 {
  public static void main(String[] args) {   
       
    System.out.print("Por favor, introduzca solo la Hora en la que estamos sin minutos ");
    int n = Integer.parseInt(System.console().readLine());
    
    
    
    if ((n >= 6) && (n <= 12)) {
      System.out.println("Buenos Días");
    }  
    
    if ((n >= 13) && (n <= 20)) {
      System.out.println("Buenas tardes");
    }  
    
    if ((n >= 21) && (n <= 24)) {
      System.out.println("Buenas noches");
    }  
    
    if ((n >= 0) && (n <= 5)) {
      System.out.println("Buenas noches");
    }  
  }
}
