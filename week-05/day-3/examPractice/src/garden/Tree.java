package garden;

public class Tree extends Plants{

  public Tree(String color) {
    super(color);
    super.type = "Flower";
  }

  @Override
  public boolean needsWater() {
    if (waterLvl < 10) {
      return true;
    }
    return false;
  }

  @Override
  public void getWater(double waterForOne) {
    double absorb = waterForOne * 0.4;
    super.waterLvl += absorb;
  }
}
