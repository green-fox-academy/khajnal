import java.util.Random;

public class Pirate {
  int rumLvl;
  boolean passedOut;
  boolean alive;
  boolean parrot;

  public Pirate() {
    rumLvl = 0;
    passedOut = false;
    alive = true;
    Random random = new Random();
    int parrotCreator = random.nextInt(2);
    if (parrotCreator == 0) {
      parrot = true;
    } else {
      parrot = false;
    }
  }

  public int drinkSomeRum() {
    if (alive == true || passedOut == false) {
      rumLvl++;
    } else {
      System.out.println("He's dead");
    }
    return rumLvl;
  }

  public boolean howItGoingMate() {
    if (alive == false) {
      System.out.println("He's dead");
    } else if (passedOut == true) {
      System.out.println("He passed out");
    } else if (rumLvl <= 4) {
      System.out.println("Pour me anudder!");
      rumLvl++;
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      passedOut = true;
    }
    return passedOut;
  }

  public boolean die() {
    return alive = false;
  }

  public void brawn(Pirate pirate2) {
    if (passedOut == true) {
      System.out.println("Do not hurt him, he passed out");
    } else if (alive == false) {
      System.out.println("You cannot fight with him. He is already dead");
    } else if (pirate2.passedOut == true) {
      System.out.println("Do not hurt him, he passed out");
    } else if (pirate2.alive == false) {
      System.out.println("You cannot fight with him. He is already dead");
    } else {
      Random random = new Random();
      int luck = random.nextInt(3);
      if (luck == 0) {
        alive = false;
      } else if (luck == 1) {
        pirate2.alive = false;
      } else if (luck == 2) {
        passedOut = true;
        pirate2.passedOut = true;
      }
    }
  }
  public void checkStatus() {
    System.out.println("Rumlvl: " + rumLvl);
    System.out.println("Alive: " + alive);
    System.out.println("Passed out: " + passedOut);
    System.out.println("Parrot: " + parrot);
  }
}
