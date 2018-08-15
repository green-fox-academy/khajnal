public class Main {
  public static void main(String[] args) {
    PostIt first = new PostIt("orange", "Idea1", "blue");
    PostIt second = new PostIt("pink", "Awesome", "black");
    PostIt third = new PostIt("yellow", "Superb", "green");
    System.out.println(second.text);
  }
}
