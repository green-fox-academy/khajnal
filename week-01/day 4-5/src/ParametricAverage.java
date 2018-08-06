import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Write me an integer");
    int userInput = in.nextInt();
    int c = userInput;

    for (int b = 0; b < userInput; b++) {
      System.out.println("Enter " + c-- + " more integer(s)");
      in.nextInt();
    }
    System.out.println("Sum: " + "Average ");
  }
}
