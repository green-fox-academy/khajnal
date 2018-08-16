public class SumDigit {
  public static void main(String[] args) {
    int number = 1336;
    System.out.println(sumDigits(number));
  }
  private static int sumDigits(int number) {
    if (number == 0) {
      return 0;
    } else {
      return number % 10 + sumDigits(number / 10);
    }
  }
}
