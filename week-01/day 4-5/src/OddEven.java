import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Write a number");
    int a = in.nextInt();
    if (a % 2 == 0) {
      System.out.println("It's an even nr");
    } else {
      System.out.println("It's an odd nr");}

  }
}
