public class Main {
  public static void main(String[] args) {
    Student john = new Student("John", 20, "Male", "Huli");
    Student clone = john.clone();
    clone.introduce();
  }
}
