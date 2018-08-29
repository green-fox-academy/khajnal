package hero;

public class DCHero extends Hero {

  public DCHero (String name) {
    super(name);
    super.motivation = 45;
  }

  public DCHero(String name, int motivation) {
    super(name, motivation);
  }

  @Override
  public void punch(Punchable other) {
    if (other instanceof DCHero == false) {
      super.punch(other);
    }
  }
}