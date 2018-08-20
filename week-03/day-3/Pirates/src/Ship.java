import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> ship = new ArrayList<>();
  String nameOfShip;

  public Ship(String nameOfShip) {
    this.nameOfShip = nameOfShip;
  }

  public List fillship(String captainname) {
    ship.add(new Pirate(captainname));
    Random random = new Random();
    for (int i = 0; i < random.nextInt(10); i++) {
      ship.add(new Pirate());
    } return ship;
  }

  public int checkMembers() {
    int members = 0;
    for (int i = 0; i < ship.size(); i++) {
      members++;
    } return members;
  }
}
