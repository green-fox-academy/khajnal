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
    if (motivation>= 1) {
      double damage = motivation / 1.5;
      bePunched(damage);
    } else {
      System.out.println("I am not motivated enough");
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
    motivation = motivation - (damage / motivation);
  }

  public String toString() {
    String status = "";
    if (motivation == 0) {
      status = getName() + " is not motivated anymore.";
    } else if (motivation == 1) {
      status = getName() + " is motivated.";
    } else if (motivation == 2) {
      status = getName() + "is well motivated";
    }
    return status;
  }

  public double getMotivation() {
    return motivation;
  }
}
