public class Main {
  public static void main(String[] args) {
    Sharpie mySharpie = new Sharpie("blue", 1.25);
    mySharpie.use();
    System.out.println(mySharpie.inkAmount);
  }
}
