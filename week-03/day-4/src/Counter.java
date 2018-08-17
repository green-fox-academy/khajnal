public class Counter {
  public static void main(String[] args) {
    int number = 10;
    System.out.println(finalCountDown(number));
  }
  public static int finalCountDown(int n) {
    if (n == 0) {
      return 0;
    } else {
      return finalCountDown(n - 1);
    }
  }
}