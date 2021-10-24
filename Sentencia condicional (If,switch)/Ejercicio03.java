
public class Ejercicio03 {
  public static void main(String[] args) {   
       
    System.out.print("Por favor, introduzca un numero del 1 al 7: ");
    int n = Integer.parseInt(System.console().readLine());
    
    String nombreDelaSemana;
    
    switch (n) {
      case 1:
        nombreDelaSemana = "Lunes";
        break;
      case 2:
        nombreDelaSemana = "Martes";
        break;
      case 3:
        nombreDelaSemana = "Miercoles";
        break;
      case 4:
        nombreDelaSemana = "Jueves";
        break;
      case 5:
        nombreDelaSemana = "Viernes";
        break;
      case 6:
        nombreDelaSemana = "Sabado";
        break;
      case 7:
        nombreDelaSemana = "Domingo";
        break;
        
      default:
        nombreDelaSemana = "no existe ese dia";
    }

    System.out.println("El " + n + " corresponde con " + nombreDelaSemana);
  }
}
