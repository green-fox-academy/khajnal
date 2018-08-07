import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Write me an integer");
    int userInput = in.nextInt();
    int firstNumber = userInput;
    int e = 0;
    int c = 0;
    int b = 0;

    for (b = 0; b < userInput; b++) {
      System.out.println("Enter " + firstNumber-- + " more integer(s)");
      e += in.nextInt();
      c += b;

    }
    System.out.println("Sum: " + e + " Average " + (double)e / b);
  }
}
