import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Write me an integer");
    int a = in.nextInt();
    for (int c = 1; c <= a; c++) {
        System.out.print(new String(new char[a]).replace("\0"," "));
      }
      for (int b = 1; b <= a; b++) {
      System.out.println(new String(new char[b]).replace("\0","*"));
    }
  }
}
