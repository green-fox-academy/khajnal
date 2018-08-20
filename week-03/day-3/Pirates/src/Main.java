public class Main {
  public static void main(String[] args) {
    Pirate pirate1 = new Pirate();
    Pirate pirate2 = new Pirate();

    pirate2.howItGoingMate();
    pirate2.drinkSomeRum();
    pirate2.drinkSomeRum();
    pirate1.checkStatus();
    pirate2.checkStatus();

    pirate1.brawn(pirate2);
    pirate1.checkStatus();
    pirate2.checkStatus();



  }
}
