import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter a distance in km, use integer:");
    int a = in.nextInt();
    System.out.println("The distance is: " + a * (1 / 1.609344) + " miles");
  }
}
