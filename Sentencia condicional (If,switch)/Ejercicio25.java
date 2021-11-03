public class Ejercicio25 {
  public static void main(String[] args) {

    System.out.print("Introduzca la altura de la bandera en cm");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la anchura ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    System.out.print("¿Quiere el escudo bordado? (s/n) ");
     String bordado  = System.console().readLine();
    
    double area= altura * anchura ;
    double preciobandera= area * 0.01;
    
    double Pbordado = 0;
    
    switch(bordado) {
      case "s":
        Pbordado = 2.5;
        break;
      case "n":
         Pbordado = 0;
        break;
    }
    double envio = 3.25 ;
    double total = envio + Pbordado + preciobandera ;
    
    
    System.out.println("Gracias aquí tiene el desglose de su compra");
    System.out.printf("Bandera de " + area + " cm²:      %6.2f\n", preciobandera);
    System.out.printf("Precio escudo              %6.2f\n" , Pbordado);
    System.out.printf("Gastos de envido                %6.2f\n", envio);
    System.out.printf("Total              %6.2f\n",  total);
  }
}
