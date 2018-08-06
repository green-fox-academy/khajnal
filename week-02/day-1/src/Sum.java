public class Sum {
  public static void main(String[] args) {
    int b = 8;
    System.out.println(sum(b));
  }
  public static int sum (int number) {
    int temp = 0;
    for (int i = 1; i <= number; i++) {
     temp += i;
    }
    return temp;
  }
}
