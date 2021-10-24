public class Ejercicio01 {
  public static void main(String[] args) {

    String dia;

    System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
    dia = (System.console().readLine()); 

    
    switch(dia) {
      case "lunes":
         System.out.println("Programacion");
         break;
      case "martes":
         System.out.println("Programacion");
         break;
      case "miercoles":
        System.out.println("Sistemas informaticos");
        break;
      case "jueves":
        System.out.println("Programacion");
        break;
      case "viernes":
        System.out.println("Sistemas informaticos");
        break;
      case "sabado":
       System.out.println("No hay clase");
         break;
      case "domingo":
        System.out.println("No hay clase");
        break;
    }
  }
}
