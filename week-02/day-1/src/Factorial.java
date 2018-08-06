public class Factorial {
  public static void main(String[] args) {
    int a = 5;
    System.out.println(factorio(5));
  }
  public static int factorio (int number) {
    int temp = 1;
    for (int i = 1; i <= number; i++) {
      temp *= i;
    }
    return temp;
  }
}
