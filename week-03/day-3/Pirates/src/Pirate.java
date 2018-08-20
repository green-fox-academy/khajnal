public class Pirate {
  int rumLvl;
  boolean passedout;
  boolean alive;

  public Pirate() {
    rumLvl = 0;
    passedout = false;
    alive = true;
  }

  public int drinkSomeRum() {
    if (alive == true || passedout == false) {
      rumLvl++;
    } else {
      System.out.println("He's dead");
    } return rumLvl;
  }

  public boolean howItGoingMate() {
    if (alive == false) {
      System.out.println("He's dead");
    } else if (passedout == true) {
      System.out.println("He passed out");
    } else if (rumLvl <= 4) {
      System.out.println("Pour me anudder!");
      rumLvl++;
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      passedout = true;
    } return  passedout;
  }

  public boolean die() {
    return alive = false;
  }
}
