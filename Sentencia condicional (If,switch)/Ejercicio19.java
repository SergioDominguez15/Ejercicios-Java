public class Ejercicio19 {  
    public static void main(String[] args) {

    System.out.println(" ------Programa para que te diga cuantas cifras tiene el número introducido por teclado y si es positivo o negativo Max 5 cifras------ " );
    System.out.print("Por favor, intruce un numero sin decimales ");
    int num = Integer.parseInt(System.console().readLine());
    
    
    if ((num >= 0) && (num < 10)) {
    System.out.println("El numero " + num + " tiene 1 cifra y es positivo ") ;
    }  
    if ((num >= 10) && (num < 100)) {
      System.out.println("El numero " + num + " tiene 2 cifra y es positivo ");
    }  
    if ((num >= 100) && (num < 1000)) {
      System.out.println("El numero " + num + " tiene 3 cifra y es positivo ");
    }  
    if ((num >= 1000) && (num < 10000)) {
      System.out.println("El numero " + num +" tiene 4 cifra y es positivo ");
    } 
    if ((num >= 10000) && (num < 100000)) {
      System.out.println("El numero " + num + " tiene 5 cifra y es positivo ");
    }
    if ((num < 0) && (num > -10)) {
    System.out.println("El numero " + num + " tiene 1 cifra y es negativo ") ;
    }  
    if ((num <= -10) && (num > -100)) {
      System.out.println("El numero " + num + " tiene 2 cifra y es negativo ");
    }  
    if ((num <= -100) && (num > -1000)) {
      System.out.println("El numero " + num + " tiene 3 cifra y es negativo ");
    }  
    if ((num <= -1000) && (num > -10000)) {
      System.out.println("El numero " + num +" tiene 4 cifra y es negativo ");
    } 
    if ((num <= -10000) && (num > -100000)) {
      System.out.println("El numero " + num + " tiene 5 cifra y es negativo ");
    } 
  }
}
