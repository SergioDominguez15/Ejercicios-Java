public class Ejercicio18 {  
    public static void main(String[] args) {

    System.out.println(" ------Programa para que te diga cual es la primera cifra de un número entero introducido por teclado. Max 5 cifras------ " );
    System.out.print("Por favor, intruce un numero sin decimales ");
    int num = Integer.parseInt(System.console().readLine());
    
    
    if ((num >= 0) && (num < 10)) {
    System.out.println("La primera cifra del numero intrudido es el " + num);
    }  
    if ((num >= 10) && (num < 100)) {
      System.out.println("La primera cifra del numero intrudido es " + (num/10));
    }  
    if ((num >= 100) && (num < 1000)) {
      System.out.println("La primera cifra del numero intrudido es " + (num/100));
    }  
    if ((num >= 1000) && (num < 10000)) {
      System.out.println("La primera cifra del numero intrudido es " + (num/1000));
    } 
    if ((num >= 10000) && (num <= 100000)) {
      System.out.println("La primera cifra del numero intrudido es " + (num/10000));
    
    } 
  }
}
