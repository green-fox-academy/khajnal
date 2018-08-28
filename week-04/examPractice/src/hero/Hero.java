package hero;

public class Hero extends BaseHero implements Punchable {
  protected double motivation;

  Hero(String name, int motivation) {
    super(name);
    this.motivation = motivation;
  }

  Hero(String name) {
    super(name);
  }

  @Override
  public void punch(Punchable other) {
    if (getMotivationLevel()>= 1) {
      double damage = motivation / 1.5;
      bePunched(damage);
    }
  }

  @Override
  public int getMotivationLevel() {
    int motLvl = 0;
    if (motivation < 25) {
      motLvl = 0;
    } else if (25 <= motivation && motivation <= 40) {
      motLvl = 1;
    } else if (motivation > 40) {
      motLvl = 2;
    }
    return motLvl;
  }

  @Override
  public void bePunched(double damage) {
    motivation -= damage / motivation;
  }

  public String toString() {
    String status = "";
    if (getMotivationLevel() == 0) {
      status = getName() + " is not motivated anymore.";
    } else if (getMotivationLevel() == 1) {
      status = getName() + " is motivated.";
    } else if (getMotivationLevel() == 2) {
      status = getName() + "is well motivated";
    }
    return status;
  }

  public double getMotivation() {
    return motivation;
  }
}