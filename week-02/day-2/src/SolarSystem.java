import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem {
  public static void main(String[] args) {
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
    System.out.println(putSaturn(planetList));
  }
  public static ArrayList<String> putSaturn(ArrayList<String> example) {
    ArrayList<String> planets = new ArrayList<>();
    for (int i = 0; i < example.size(); i++) {
      planets.add(example.get(i));
    }
    planets.add("Saturn");
    return planets;
  }
}
