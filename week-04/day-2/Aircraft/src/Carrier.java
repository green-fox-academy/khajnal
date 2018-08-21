import java.util.ArrayList;
import java.util.List;

public class Carrier {
  int ammoStore;
  int hp;
  List<Aircraft> army = new ArrayList<>();

  public Carrier(int ammoStore, int hp) {
    this.ammoStore = ammoStore;
    this.hp = hp;
  }

  public void add(Aircraft aircraft) {
    army.add(aircraft);
  }

  public void fill() {
    int allMissingAmmo = 0;
    for (int i = 0; i < army.size(); i++) {
      allMissingAmmo += army.get(i).maxAmmo - army.get(i).ammo;
    }
    if (allMissingAmmo > ammoStore) {
      for (int i = 0; i < army.size(); i++) {
        if (army.get(i).isPriority()) {
          army.get(i).refill(ammoStore);
          ammoStore -= army.get(i).ammo;
        }
      }
    } else {
      for (int i = 0; i < army.size(); i++) {
        army.get(i).refill(ammoStore);
        ammoStore -= army.get(i).ammo;
      }
    }
  }
}
