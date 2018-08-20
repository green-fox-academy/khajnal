import java.util.Random;

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
    }
    return rumLvl;
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
    }
    return passedout;
  }

  public boolean die() {
    return alive = false;
  }

  public void brawn(Pirate pirate2) {
    if (passedout == true) {
      System.out.println("Do not hurt him, he passed out");
    } else if (alive == false) {
      System.out.println("You cannot fight with him. He is already dead");
    } else if (pirate2.passedout == true) {
      System.out.println("Do not hurt him, he passed out");
    } else if (pirate2.alive == false) {
      System.out.println("You cannot fight with him. He is already dead");
    } else {
      Random random = new Random();
      int luck = random.nextInt(3);
      if (luck == 1) {
        alive = false;
      } else if (luck == 2) {
        pirate2.alive = false;
      } else if (luck == 3) {
        passedout = true;
        pirate2.passedout = true;
      }
    }
  }
  public void checkStatus() {
    System.out.println("Rumlvl: " + rumLvl);
    System.out.println("Alive: " + alive);
    System.out.println("Passed out: " + passedout);
  }
}
