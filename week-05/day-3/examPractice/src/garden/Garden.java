package garden;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    if (plantsNeedWater.size() == 0) {
      return;
    }
    double waterForOne = water / plantsNeedWater.size();
    plantsNeedWater.stream()
      .forEach(plant -> plant.getWater(waterForOne));
  }

  private List<Plant> listOfWaterNeedPlants() {
    return garden.parallelStream()
      .filter(Plant::needsWater)
      .collect(Collectors.toList());
  }
}