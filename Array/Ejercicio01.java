public class Ejercicio01 {
  public static void main(String[] args) {
        

    int[] num = new int[12];
                
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;

    for (int i = 0; i < 12; i++) {
      System.out.printf("num[%2d]: %d\n", i, num[i]);
    }   

  }
}
