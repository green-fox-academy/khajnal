import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Write me two integers");
    int a = in.nextInt();
    int b = in.nextInt();

    if (a >= b) {
      System.out.println("The second number should be bigger");
    } else {
      for (int c = a; c <= b; c++) {
        System.out.println(c);
      }
    }
  }
}
