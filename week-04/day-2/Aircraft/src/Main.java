public class Main {
  public static void main(String[] args) {
    Aircraft f16 = new F16();
    Aircraft f35 = new F35();
    System.out.println(f35.getStatus());
    System.out.println(f35.isPriority());

  }
}
