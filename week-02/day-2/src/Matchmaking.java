import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
  public static void main(String[] args) {
    ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));
    System.out.println(makingMatches(girls, boys));
  }
  public static ArrayList<String> makingMatches (ArrayList<String> girls, ArrayList<String>boys) {
    ArrayList<String> girlsAndBoys = new ArrayList<>();
    for (int i = 0; i < girls.size(); i++) {
      girlsAndBoys.add(girls.get(i));
      girlsAndBoys.add(boys.get(i));
    }
    return girlsAndBoys;
  }
}
