public class Flower extends Plant{

  public Flower(String color) {
    super(color);
  }

  public void getWater(int water) {
    waterLvl += water * 0.75;
  }
}
