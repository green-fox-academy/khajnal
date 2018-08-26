import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Write me an integer");
    int userInput = in.nextInt();
    int firstNumber = userInput;
    int sum = 0;
    int elementNr = 0;

    for (int i = 0; i < userInput; i++) {
      System.out.println("Enter " + firstNumber-- + " more integer(s)");
      sum += in.nextInt();
      elementNr++;
    }
    System.out.println("Sum: " + sum + " Average " + (double)sum / elementNr);
  }
}