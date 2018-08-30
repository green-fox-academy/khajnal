package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plants> garden = new ArrayList<>();

  public String getGardenStatus() {
    String status = "";
    for (Plants onePlant : garden) {
      status += onePlant.getStatus + "\n";
      }
    }
  }
  }
}
