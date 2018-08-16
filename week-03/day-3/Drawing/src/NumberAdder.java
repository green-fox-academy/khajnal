public class NumberAdder {
  public static void main(String[] args) {
    int number = 5;
    System.out.println(addFromOne(number));
  }
  private static int addFromOne(int number) {
    if (number == 1) {
      return number;
    } else {
      return number + addFromOne(number -  1);
    }
  }
}
