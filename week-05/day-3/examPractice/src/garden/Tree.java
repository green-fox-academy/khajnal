package garden;

public class Tree extends Plants{

  public Tree(String color) {
    super(color);
  }

  @Override
  public String getStatus() {
    return "The " + color + " Tree ";
  }
}
