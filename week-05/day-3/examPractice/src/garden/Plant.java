package garden;

public abstract class Plant {
  protected String type;
  private int waterLevel;
  private String color;
  private int waterCapacity;
  private double waterAbsorbCapacity;


  public Plant(String color, int waterCapacity, double waterAbsorbCapacity) {
    this.color = color;
    this.waterCapacity = waterCapacity;
    this.waterAbsorbCapacity = waterAbsorbCapacity;
    waterLevel = 0;
  }

  public boolean needsWater() {
    return waterLevel < waterCapacity;
  }

  public void getWater(double waterForOne) {
    double absorb = waterForOne * waterAbsorbCapacity;
    waterLevel += absorb;
  }

  public String getStatus(Plant plant) {
    if (plant.needsWater()) {
      return String.format("The %s %s needs water.", color, type);
    }
    return String.format("The %s %s doesn't need water.", color, type);
  }
}