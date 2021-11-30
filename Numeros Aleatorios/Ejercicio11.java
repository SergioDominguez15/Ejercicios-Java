public class Ejercicio11 {

  public static void main(String[] args) {
    
    int nota;
    int insuficientes = 0;
    int suficientes = 0;
    int bienes = 0;
    int notables = 0;
    int sobresalientes = 0;
    
    for(int i = 0; i < 20; i++) {
      
      nota = (int)(Math.random() * 11);
      
      switch(nota) {
        case 0:
          System.out.print("insuficiente ");
          insuficientes++;
          break;
        case 1:
          System.out.print("insuficiente ");
          insuficientes++;
          break;
        case 2:
          System.out.print("insuficiente ");
          insuficientes++;
          break;
        case 3:
          System.out.print("insuficiente ");
          insuficientes++;
          break;
        case 4:
          System.out.print("insuficiente ");
          insuficientes++;
          break;
        case 5:
          System.out.print("suficiente ");
          suficientes++;
        break;
        case 6:
          System.out.print("bien ");
          bienes++;
        break;
        case 7:
          System.out.print("notable ");
          notables++;
        break;
        case 8:
          System.out.print("notable ");
          notables++;
        break;
        case 9:
          System.out.print("sobresaliente ");
          sobresalientes++;
        break;
        case 10:
          System.out.print("sobresaliente ");
          sobresalientes++;
        break;
        default:

      }

    }
    
    System.out.println("\nNº de insuficientes: " + insuficientes);
    System.out.println("Nº de suficientes: " + suficientes);
    System.out.println("Nº de bienes: " + bienes);
    System.out.println("Nº de notables: " + notables);
    System.out.println("Nº de sobresalientes: " + sobresalientes);
  }
}
