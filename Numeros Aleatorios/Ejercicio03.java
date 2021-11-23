public class Ejercicio03 {
  public static void main(String[] args) {
    
    String palo = "";
    String carta = "";
    
    int numeroPalo = (int)(Math.random()*4) + 1;
    
    switch(numeroPalo) {
      case 1:
        palo = "oro";
        break;
      case 2:
        palo = "espadas";
        break;
      case 3:
        palo = "copas";
        break;
      case 4:
        palo = "bastos";
      default:
    }

    int numeroCarta = (int)(Math.random()*12) + 1;
    
    switch(numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 10:
        carta = "sota";
        break;
      case 11:
        carta = "caballo";
        break;
      case 12:
        carta = "Rey";
        break;
      default:
        carta = String.valueOf(numeroCarta);
    }
    
    System.out.println(carta + " de " + palo);
  }
}
