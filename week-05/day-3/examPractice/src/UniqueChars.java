import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueChars {
  public static void main(String[] args) {
    // Create a function called `uniqueCharacters` that takes a string as parameter
    // and returns a list with the unique letters of the given string
    // Create basic unit tests for it with at least 3 different test cases
    System.out.println(uniqueCharacters("anagram"));
    // Should print out:
    // ["n", "g", "r", "m"]
  }

  private static Map<String, Integer> characterCounter(String anagram) {
    String[] splittedText = anagram.split("");
    Map<String, Integer> lettersCounted = new HashMap<>();
    for (int i = 0; i < splittedText.length; i++) {
      if (!lettersCounted.containsKey(splittedText[i])) {
        lettersCounted.put(splittedText[i], 1);
      } else {
        lettersCounted.put(splittedText[i], lettersCounted.get(splittedText[i]) + 1);
      }
    }
    return lettersCounted;
  }
}