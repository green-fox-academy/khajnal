public class Main {
  public static void main(String[] args) {
    Car trabi = new Car("Trabi");
    Station mol = new Station("MOL", 50000);

    mol.refill(trabi);
    trabi.checkFuelLvl();
    mol.fuelforSale();
  }
}
