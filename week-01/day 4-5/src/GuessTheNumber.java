import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Guess the number!");
    int b = 8;
    int c = in.nextInt();
    while (c != b) {
      if (c > b) {
        System.out.println("The stored number is lower");
        c = in.nextInt();
      } else if (c < b) {
        System.out.println("The stored number is higher");
        c = in.nextInt();
      }
    }
    System.out.println("You found the number " + b);
  }
}
