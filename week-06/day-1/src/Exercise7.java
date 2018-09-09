import java.util.HashMap;
import java.util.Map;

public class Exercise7 {
  public static void main(String[] args) {
    String poem = "Tyger Tyger, burning bright, In the forests of the night";

    System.out.println(charFrequencyMethod(poem));
  }

  private static Map<Character, Integer> charFrequencyMethod(String example) {
    Map<Character, Integer> charFrequency = new HashMap<>();
    for (Character oneChar : example.toLowerCase().toCharArray()) {
      if (!charFrequency.containsKey(oneChar)) {
        charFrequency.put(oneChar, 1);
      } else {
        charFrequency.put(oneChar, charFrequency.get(oneChar) + 1);
      }
    }
    return charFrequency;
  }
}