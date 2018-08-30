import java.util.Random;

public class tryRandoms {
  public static void main(String[] args) {
  Random random = new Random();
  int number = random.nextInt(10);

  int numbertwo = (int)(Math.random() * 10);

    System.out.println(number);
    System.out.println(numbertwo);
  }
}