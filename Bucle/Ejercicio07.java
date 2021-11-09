public class Ejercicio07 {
	
	public static void main (String[] args) {
		
    
    System.out.println("Control de Acceso de la caja fuerte, 4 cifras. ");
    int contador = 0 ;
    
    while (contador <= 3) {
    System.out.println("Por favor, introduce la combinacion de la caja fuuerte (4 Cifras)");
    int combinacion = Integer.parseInt(System.console().readLine());
      
      if ( combinacion == 1111) {
        System.out.println ("La caja se ha abierto correctamente");
        break;
      } 
      else {
        System.out.println("Lo siento esa no es la combinacion");
        contador += 1;
      }


      }
    
    
    
    
    
	}
}

