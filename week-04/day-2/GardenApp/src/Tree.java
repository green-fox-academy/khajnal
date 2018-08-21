public class Tree extends Plant {

  public Tree(String color) {
    super(color);
  }

  public void getWater(int water) {
    waterLvl += water * 0.4;
  }
}
