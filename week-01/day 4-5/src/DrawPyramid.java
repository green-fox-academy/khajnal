import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    System.out.println("Enter an integer");
    Scanner scanner = new Scanner(System.in);
    int nrOfLines = scanner.nextInt();
    String star = "*";
    String stars;
    String spaces;
    int nrOfSpaces = nrOfLines;
    int nrOfStarsSec = 0;

    for (int i = 0; i <= nrOfLines; i++) {
      System.out.print(new String(new char[nrOfSpaces]).replace("\0", " "));
      System.out.print(new String(new char[i]).replace("\0", "*"));
      System.out.print(new String(new char[nrOfStarsSec]).replace("\0", "*"));
      System.out.println();
      nrOfSpaces--;
      nrOfStarsSec++;
    }
  }
}
