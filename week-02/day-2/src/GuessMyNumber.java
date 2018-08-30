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
    System.out.println("Please enter a number, I will think of a number between 1 and your number. You have 5 lives.");
    int nrToGuess = getRandomNumber(scanner.nextInt());
    int guess;
    System.out.println("Please enter your guess.");
    int life = 5;
    for (int i = 5; i > 0; i--) {
      life--;
      guess = scanner.nextInt();
      if (guess < nrToGuess) {
        System.out.println("Too low, You have " + life +" lives left.");
      } else if (guess > nrToGuess) {
        System.out.println("Too high, You have " + life + " lives left.");
      } else if (nrToGuess == guess) {
        System.out.println("You won!");
        break;
      }
    }
  }
}