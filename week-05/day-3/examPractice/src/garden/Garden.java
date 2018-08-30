package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> garden = new ArrayList<>();

  public void addPlant(Plant plant) {
    garden.add(plant);
  }

  public String getGardenStatus() {
    String status = "";
    for (Plant onePlant : garden) {
      status += onePlant.getStatus(onePlant) + "\n";
      }
    return status;
  }

  public void waterTheGardenWithStatus(int water) {
    System.out.println("Watering with " + water);
    waterTheGarden(water);
    System.out.println(getGardenStatus());
  }

  private void waterTheGarden(int water) {
    List<Plant> plantsNeedWater = listOfWaterNeedPlants();
    double waterForOne = water / plantsNeedWater.size();
    for (Plant onePlant : plantsNeedWater) {
      onePlant.getWater(waterForOne);
    }
  }

  private List<Plant> listOfWaterNeedPlants() {
    List<Plant> plantsNeedWater = new ArrayList<>();
      for (Plant onePlant : garden) {
        if (onePlant.needsWater()) {
          plantsNeedWater.add(onePlant);
        }
      }
    return plantsNeedWater;
  }
}
