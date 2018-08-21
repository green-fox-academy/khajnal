import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> allPlants = new ArrayList<>();

  public Garden() {

  }

  public void addFlower(Flower flower) {
    allPlants.add(flower);
  }

  public void addTree(Tree tree) {
    allPlants.add(tree);
  }

  public void waterPlants(double waterQty) {
    double nrOfWaterNeeders = 0;
    for (int i = 0; i < allPlants.size(); i++) {
      if (allPlants.get(i).needsWater() == true) {
        nrOfWaterNeeders++;
      }
    }
    System.out.println("Watering with: " + waterQty);
    for (int i = 0; i < allPlants.size(); i++) {
      allPlants.get(i).water(waterQty / nrOfWaterNeeders);
    }
    for (int i = 0; i < allPlants.size(); i++) {
      allPlants.get(i).checkStatus();
    }
  }

  public void checkStatus() {
    for (int i = 0; i < allPlants.size(); i++) {
      allPlants.get(i).checkStatus();
    }
  }
}