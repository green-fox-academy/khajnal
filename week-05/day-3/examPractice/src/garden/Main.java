package garden;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Garden myGarden = new Garden();
    Flower flowerOne = new Flower("yellow");
    Flower flowerTwo = new Flower("blue");
    Tree treeOne = new Tree("purple");
    Tree treeTwo = new Tree("orange");

    myGarden.addPlant(flowerOne);
    myGarden.addPlant(flowerTwo);
    myGarden.addPlant(treeOne);
    myGarden.addPlant(treeTwo);

    System.out.println(myGarden.getGardenStatus());
  }
}
