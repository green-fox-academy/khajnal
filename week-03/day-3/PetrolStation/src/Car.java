public class Car {
  int gasAmount;
  int capacity;
  String type;

  public Car(String type) {
    gasAmount = 0;
    capacity = 100;
    this.type = type;
  }
  public void checkFuelLvl(){
    System.out.println(type +" gas amount: " + gasAmount);
  }
}
