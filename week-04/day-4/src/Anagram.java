import java.util.ArrayList;
import java.util.List;

public class Anagram {
  List<String> listOfStrings = new ArrayList<>();

  public void addTwoStringToAList(String one, String two) {
    listOfStrings = new ArrayList<>();
    listOfStrings.add(one);
    listOfStrings.add(two);
  }

  public int sizeOfList() {
    return listOfStrings.size();
  }
}
