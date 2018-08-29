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
    while (guess != nrToGuess) {
      System.out.println("I have a number between 1-100, please enter your guess.");
      guess = scanner.nextInt();
      if (guess < nrToGuess) {
        
      }
    }
  }
}
