package garden;

import java.util.ArrayList;
import java.util.List;

public abstract class Plants {
  protected String type;
  protected int waterLvl;
  protected String color;

  public Plants(String color) {
    this.color = color;
    waterLvl = 0;
  }

  public abstract boolean needsWater();

  public abstract void getWater(double waterForOne);

  public String getStatus(Plants plant) {
    if (plant.needsWater() == true) {
      return "The " + color + type + " needs water.";
    }
    return "The " + color + type + " doesn't need water.";
  }
}
