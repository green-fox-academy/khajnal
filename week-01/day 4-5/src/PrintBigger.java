import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Write me two numbers!");
    double a = in.nextDouble();
    double b = in.nextDouble();

    if (a > b) {
      System.out.println(a);
    } else if (a < b) {
      System.out.println(b);
    } else if (a == b) {
      System.out.println("Equal");
    }
  }
}
