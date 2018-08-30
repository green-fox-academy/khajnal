package garden;

public class Tree extends Plants{

  public Tree(String color) {
    super(color);
  }

  @Override
  public String getStatus() {
    return "The " + color + " Tree ";
  }

  @Override
  public boolean needsWater() {
    if (waterLvl < 10) {
      return true;
    }
    return false;
  }
}
