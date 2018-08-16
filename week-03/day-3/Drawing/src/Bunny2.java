public class Bunny2 {
  public static void main(String[] args) {
    int bunnies = 10;
    System.out.println(sumBunnyEars(bunnies));
  }

  private static int sumBunnyEars(int bunnies) {
    if (bunnies == 0) {
      return 0;
    } else {
      if (bunnies % 2 == 0) {
        return 2 + sumBunnyEars(bunnies - 1);
      } else {
        return 3 + sumBunnyEars(bunnies - 1);
      }
    }
  }
}
