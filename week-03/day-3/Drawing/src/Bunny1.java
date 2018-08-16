public class Bunny1 {
  public static void main(String[] args) {
    int bunnies = 10;
    System.out.println(sumBunnyEars(bunnies));
  }
  private static int sumBunnyEars(int bunnies) {
    if (bunnies == 0) {
      return 0;
    } else {
      return 2 + sumBunnyEars(bunnies - 1);
    }
  }
}
