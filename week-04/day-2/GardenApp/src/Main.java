public class Main {
  public static void main(String[] args) {
    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");
    Tree tree1 = new Tree("purple");
    Tree tree2 = new Tree("orange");
    Garden garden = new Garden();
    garden.addFlower(flower1);
    garden.addFlower(flower2);
    garden.addTree(tree1);
    garden.addTree(tree2);

    garden.checkStatus();

    garden.waterPlants(10);
    garden.waterPlants(18);
  }
}