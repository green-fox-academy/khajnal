import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {
  private List<String> listOfStrings = new ArrayList<>();

  public void addTwoStringToAList(String one, String two) {
    listOfStrings = new ArrayList<>();
    listOfStrings.add(one.toLowerCase());
    listOfStrings.add(two.toLowerCase());
  }

  public int sizeOfList() {
    return listOfStrings.size();
  }

  public boolean ifAnagrams() {
    ArrayList<Character> firstString = new ArrayList<>();
    ArrayList<Character> secondString = new ArrayList<>();
    for (int i = 0; i < listOfStrings.get(0).length(); i++) {
      firstString.add(listOfStrings.get(0).charAt(i));
    }
    for (int i = 0; i < listOfStrings.get(1).length(); i++) {
      secondString.add(listOfStrings.get(1).charAt(i));
    }
    Collections.sort(firstString);
    Collections.sort(secondString);
    return firstString.equals(secondString);
  }
}
