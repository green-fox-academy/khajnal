package garden;

public abstract class Plants {
  protected int waterLvl;
  protected String color;

  public Plants(String color) {
    this.color = color;
  }

  public abstract String getStatus();
}
