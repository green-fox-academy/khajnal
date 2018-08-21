public class Flower extends Plant{

  public Flower(String color) {
    super(color);
  }

  public void water(double waterQty) {
    if (waterLvl < 5) {
      waterLvl += waterQty * 0.75;
    }
  }

  public void checkStatus() {
    if (waterLvl < 5) {
      System.out.println("The " + color + " " + "Flower does need water");
      System.out.println("The " + color + " " + "Flower doesn't need water current water");
    }
  }

  public boolean needsWater() {
    boolean needsWater = false;
    if (waterLvl < 5) {
      return needsWater = true;
    } return needsWater;
  }
}