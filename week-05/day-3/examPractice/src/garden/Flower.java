package garden;

public class Flower extends Plants {

  public Flower(String color) {
    super(color);
  }

  @Override
  public String getStatus() {
    return "The " + color + " Flower ";
  }
}
