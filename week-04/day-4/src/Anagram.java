import java.util.ArrayList;
import java.util.List;

public class Anagram {
  private List<String> listOfStrings = new ArrayList<>();

  public void addTwoStringToAList(String one, String two) {
    listOfStrings = new ArrayList<>();
    listOfStrings.add(one);
    listOfStrings.add(two);
  }

  public int sizeOfList() {
    return listOfStrings.size();
  }

  public boolean ifAnagrams(Anagram listofStrings) {
    ArrayList<Character> firstString = new ArrayList<>();
    ArrayList<Character> secondString = new ArrayList<>();
    for (int i = 0; i < listOfStrings.get(0).length(); i++) {
      firstString.add(listOfStrings.get(0).charAt(0));
      secondString.add(listOfStrings.get(1).charAt(0));
    }
    return firstString.equals(secondString);
  }
}
