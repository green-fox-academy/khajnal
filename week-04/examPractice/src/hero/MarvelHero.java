package hero;

public class MarvelHero extends Hero {

  public MarvelHero(String name) {
    super(name);
    super.motivation = 40;
  }

  public MarvelHero(String name, int motivation) {
    super(name, motivation);
  }

  @Override
  public void punch(Punchable other) {
    if (other instanceof MarvelHero == false) {
      if (getMotivationLevel() >= 1) {
        double damage = motivation / 1.5;
        bePunched(damage);
      }
    }
  }
}
