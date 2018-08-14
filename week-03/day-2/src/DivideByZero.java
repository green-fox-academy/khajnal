import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number");
    int divisor = scanner.nextInt();
    divideByTen(divisor);
  }
  public static void divideByTen(int example) {
    int ten = 10;
    try {
      int result = ten /= example;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
}
