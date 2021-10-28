public class Ejercicio17 {  
    public static void main(String[] args) {

    System.out.println(" ------Programa para que te diga cual es la ultima cifra de un úmero entero introducido por teclado------ " );
    System.out.print("Por favor, intruce un numero sin decimales ");
    int num = Integer.parseInt(System.console().readLine());
    
    System.out.println("La última cifra del número intrudido es el " + (num % 10));
    } 
  }

