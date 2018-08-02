import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a distance in km:");
    int a = in.nextInt();
    System.out.println("The distance is: " + (a * 1000) + " meter");

  }
}
