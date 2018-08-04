import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please write 5 integers:");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int d = in.nextInt();
    int e = in.nextInt();
    double average = (a + b + c + d + e) / 5;
    System.out.println("Sum: " + (a + b + c + d + e) + ", Average: " + average);
  }
}
