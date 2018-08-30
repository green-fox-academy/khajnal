package garden;

public abstract class Plants {
  protected String type;
  protected int waterLvl;
  protected String color;
  protected int capacity;
  protected double absorbLvl;

  public Plants(String color, int capacity, double absorbLvl) {
    this.color = color;
    this.capacity = capacity;
    this. absorbLvl = absorbLvl;
    waterLvl = 0;
  }

  public boolean needsWater() {
      return waterLvl < absorbLvl;
  }

  public void getWater(double waterForOne) {
      double absorb = waterForOne * absorbLvl;
      waterLvl += absorb;
  }

  public String getStatus(Plants plant) {
    if (plant.needsWater()) {
      return "The " + color + type + " needs water.";
    }
    return "The " + color + type + " doesn't need water.";
  }
}
