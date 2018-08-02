import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("How many chickens does the farmer have?");
    int a = in.nextInt();
    System.out.println("How many pigs does the farmer have?");
    int b = in.nextInt();
    System.out.println("Number of legs: " + ((a * 2) + (b * 4)));

  }
}
