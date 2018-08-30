package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plants> garden = new ArrayList<>();

  public void addPlant(Plants plant) {
    garden.add(plant);
  }

  public String getGardenStatus() {
    String status = "";
    for (Plants onePlant : garden) {
      status += onePlant.getStatus() + "\n";
      }
    return status;
  }

  public void waterTheGardenWithStatus(int water) {
    System.out.println("Watering with " + water);
    waterTheGarden(water);
    System.out.println(getGardenStatus());
  }

  private void waterTheGarden(int water) {
    List<Plants> plantsNeedWater = listOfWaterNeedPlants();
    double waterForOne = water / plantsNeedWater.size();
    for (Plants onePLant : plantsNeedWater) {
      onePLant.getWater(waterForOne);
    }
  }

  private List<Plants> listOfWaterNeedPlants() {
    List<Plants> plantsNeedWater = new ArrayList<>();
      for (Plants onePlant : garden) {
        if (onePlant.needsWater() == true) {
          plantsNeedWater.add(onePlant);
        }
      }
    return plantsNeedWater;
  }
}
