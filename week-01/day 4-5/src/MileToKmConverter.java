import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a distance in km:");
    int a = in.nextInt();
    System.out.println("The distance is: " + (0.621371192 / a) + " miles");

  }
}
