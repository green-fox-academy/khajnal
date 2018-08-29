import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    play();
  }

  private static int getRandomNumber() {
    Random random = new Random();
    int randomNr = random.nextInt(100) + 1;
    return randomNr;
  }

  public static void play() {
    int nrToGuess = getRandomNumber();
    Scanner scanner = new Scanner(System.in);
    int guess = 0;
    System.out.println("I have a number between 1-100, please enter your guess.");
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
