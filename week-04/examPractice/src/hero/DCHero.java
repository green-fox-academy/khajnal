package hero;

public class DCHero extends Hero {
  String universe = "DC";

  public DCHero (String name) {
    super(name);
    super.motivation = 45;
  }

  public DCHero(String name, int motivation) {
    super(name, motivation);
  }

  @Override
  public void punch(Punchable other) {
    if (!universe.equals("DC")) {
      if (motivation >= 1) {
        double damage = motivation / 1.5;
        bePunched(damage);
      } else {
        System.out.println("I am not motivated enough");
      }
    }
  }
}
