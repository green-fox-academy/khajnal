public class Tree extends Plant {

  public Tree(String color) {
    super(color);
  }

  public void water(double waterQty) {
    if (waterLvl < 10) {
      waterLvl += waterQty * 0.4;
    }
  }

  public void checkStatus() {
    if (waterLvl < 10) {
      System.out.println("The " + color + " Tree does need water");
    } else {
      System.out.println("The " + color + " Tree doesn't need water");
    }
  }

  public boolean needsWater() {
    boolean needsWater = false;
    if (waterLvl < 5) {
      return needsWater = true;
    } return needsWater;
  }
}