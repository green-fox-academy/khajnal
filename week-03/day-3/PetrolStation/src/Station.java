public class Station {
  String name;
  int gasAmount;

  public Station(String name, int gasAmount) {
   this.name = name;
   this.gasAmount = gasAmount;
  }
  public void refill(Car car) {
    gasAmount -= car.capacity - car.gasAmount;
    car.gasAmount += car.capacity - car.gasAmount;
  }
  public void fuelforSale() {
    System.out.println("The gas amount at " + name + " is " + gasAmount);
  }
}
