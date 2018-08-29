import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    play();
  }

  private static int getRandomNumber(int userInput) {
    Random random = new Random();
    int randomNr = random.nextInt(userInput) + 1;
    return randomNr;
  }

  public static void play() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number, I will think of a number between 1 and your number.");
    int nrToGuess = getRandomNumber(scanner.nextInt());
    int guess = 0;
    System.out.println("Please enter your guess.");
    while (guess != nrToGuess) {
      guess = scanner.nextInt();
      if (guess < nrToGuess) {
        System.out.println("Too low.");
      } else if (guess > nrToGuess) {
        System.out.println("Too high");
      } else if (nrToGuess == guess) {
        System.out.println("You won!");
      }
    }
  }
}
