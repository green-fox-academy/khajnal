package garden;

public abstract class Plants {
  protected int waterLvl;
  protected String color;

  public Plants(String color) {
    this.color = color;
    waterLvl = 0;
  }

  public abstract String getStatus();

  public abstract boolean needsWater();
}
