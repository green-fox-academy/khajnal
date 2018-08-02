import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the number of girls that comes to party:");
    int a = in.nextInt();

    System.out.println("Enter the number of boys that comes to party:");
    int b = in.nextInt();

    if (a == b && a + b >= 20) {
      System.out.println("The party is excellent!");
    }  else if (a == 0) {
      System.out.println("Sausage party!");
    }  else if (a + b >= 20 && a != b) {
      System.out.println("Quite good party!");
    }  else if (a + b < 20){
      System.out.println("Average party!");

    }
  }
}