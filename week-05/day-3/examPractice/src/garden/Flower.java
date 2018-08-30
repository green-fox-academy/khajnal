package garden;

public class Flower extends Plants {

  public Flower(String color) {
    super(color);
    super.type = "Flower";
  }

  @Override
  public boolean needsWater() {
    if (waterLvl < 5) {
      return true;
    }
    return false;
  }

  @Override
  public void getWater(double waterForOne) {
    double absorb = waterForOne * 0.75;
    super.waterLvl += absorb;
  }
}
