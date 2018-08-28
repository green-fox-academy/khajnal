package hero;

public class MarvelHero extends Hero {
  protected String universe = "Marvel";

  public MarvelHero(String name) {
    super(name);
    super.motivation = 40;
  }

  public MarvelHero(String name, int motivation) {
    super(name, motivation);
  }

  @Override
  public void punch(Punchable other) {
    if (!universe.equals("Marvel")) {
      if (getMotivationLevel() >= 1) {
        double damage = motivation / 1.5;
        bePunched(damage);
      } else {
        System.out.println("I am not motivated enough");
      }
    }
  }

// Other solution for punch, using instanceof

//  @Override
//  public void punch(Punchable other) {
//    if (other instanceof MarvelHero == false) {
//      if (getMotivationLevel() >= 1) {
//        double damage = motivation / 1.5;
//        bePunched(damage);
//      } else {
//        System.out.println("I am not motivated enough");
//      }
//    }
//  }
}
