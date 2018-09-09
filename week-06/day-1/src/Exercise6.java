import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    List<String> filteredCities = cities.stream()
      .filter(x -> x.startsWith("A") && x.endsWith("I"))
      .collect(Collectors.toList());

    System.out.println(filteredCities);

    System.out.println(filteredCitiesMethod(cities));
  }

  public static List<String> filteredCitiesMethod(ArrayList<String> example) {
    List<String> filteredCities = new ArrayList<>();
    for (String oneString : example) {
      if (oneString.startsWith("A") && oneString.endsWith("I")) {
        filteredCities.add(oneString);
      }
    }
    return filteredCities;
  }
}