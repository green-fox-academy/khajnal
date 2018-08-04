import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please write me an integer");
    int a = in.nextInt();
    int b = 1;
    while (b < 11) {
      System.out.println(b + " * " + a + " = " + a *b);
      b += 1;
    }
  }
}
