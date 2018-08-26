import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Guess the number!");
    int tobeGuessed = 8;
    int guess = in.nextInt();
    while (guess != tobeGuessed) {
      if (guess > tobeGuessed) {
        System.out.println("The stored number is lower");
        guess = in.nextInt();
      } else if (guess < tobeGuessed) {
        System.out.println("The stored number is higher");
        guess = in.nextInt();
      }
    }
    System.out.println("You found the number " + tobeGuessed);
  }
}
