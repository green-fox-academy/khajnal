public class Animal {
  String name;
  String type;
  int hunger;

  public Animal(String name, String type) {
    this.name = name;
    this.type = type;
    hunger = 5;
  }
  public void eat() {
    hunger--;
  }
  public void run() {
    hunger++;
  }
}