public class Ejercicio12 {

  public static void main(String[] args) {
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("-------CUESTIONARIO-------");
    
    System.out.println("1. ¿Cuál es el lenguaje de programacion más usado a fecha de Octubre del 2021?");
    System.out.println("a) Java \nb) Pyhton \nc) C"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("2. ¿Cuál es el segundo lenguaje de programacion más usado a fecha de Octubre del 2021?");
    System.out.println("a) Java \nb) Python \nc) C"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }

    System.out.println("3. ¿Cuál es el tercer lenguaje de programacion más usado a fecha de Octubre del 2021?");
    System.out.println("a) Java \nb) Python \nc) C"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("4. ¿Cuál fue el primer lenguaje de programacion?");
    System.out.println("a) FORTRAN \nb) COBOL \nc) BASIC"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("5. ¿Con que ditribucion está basado Ubuntu??");
    System.out.println("a) Linux \nb) Windows \nc) Mac OS"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }

    System.out.println("\nHa obtenido " + puntos + " puntos.");
  }
}
