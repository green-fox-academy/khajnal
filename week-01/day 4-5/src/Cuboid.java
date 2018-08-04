public class Cuboid {
  public static void main(String[] args) {
    double a = 5.5;
    double b = 10.5;
    double c = 15.5;
    double volume = a * b * c;
    double surfaceArea = 2 * (a * b + a * c + b * c);
    System.out.println("Surface Area: " + (int) surfaceArea);
    System.out.println("Volume: " + (int) volume);
  }
}
