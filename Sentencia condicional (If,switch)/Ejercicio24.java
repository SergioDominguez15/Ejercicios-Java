public class Ejercicio24 {
  public static void main(String[] args) {

    System.out.print("Introduzca el Nº del cargo 1- prog. junior, 2- prog. senior, 3- Jefe de proyecto ");
    int cargo = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca los días que ha estado de viaje visitando clientes? ");
    int dias = Integer.parseInt(System.console().readLine());
    
    System.out.print("Diganos su estado civil con Número 1-Soltero 2- Casado ");
    int ECivil = Integer.parseInt(System.console().readLine());
    
    double salario= 0 ;
    
    switch(cargo) {
      case 1:
        salario= 950;
        break;
      case 2:
         salario = 1200;
        break;
      case 3:
         salario = 1600;
        break;
      default:
        System.out.println("El cargo introducido no es correcto.");
    }
    
    double dietas = dias * 30;
    double sueldobruto = salario + dietas;

    double retencion = 0 ;
    
    switch(ECivil) {
      case 1: 
        retencion = sueldobruto * 0.25;
        break;
      case 2: 
        retencion = sueldobruto * 0.20;
        break;
      default:
        System.out.println("El estado civil introducido no es correcto.");
    }
    
    
    double sueldototal = sueldobruto - retencion;
    
    System.out.printf("Salario Base                %6.2f\n", salario);
    System.out.printf("total en dietas             %6.2f\n" , dietas);
    System.out.printf("Sueldo Bruto                %6.2f\n", sueldobruto);
    System.out.printf("Retencion IRPF              %6.2f\n",  retencion);
    System.out.printf("Sueldo Total                %6.2f", sueldototal);
  }
}
