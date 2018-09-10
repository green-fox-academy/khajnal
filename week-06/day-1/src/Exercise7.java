import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {
    String poem = "Tyger Tyger, burning bright, In the forests of the night";

    Map<Character, Long> frequency = poem.chars()
      .mapToObj(x -> (char) x)
      .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
    System.out.println(frequency);

    System.out.println(charFrequencyMethod(poem));
  }

  private static Map<Character, Integer> charFrequencyMethod(String example) {
    Map<Character, Integer> charFrequency = new HashMap<>();
    for (Character oneChar : example.toCharArray()) {
      if (!charFrequency.containsKey(oneChar)) {
        charFrequency.put(oneChar, 1);
      } else {
        charFrequency.put(oneChar, charFrequency.get(oneChar) + 1);
      }
    }
    return charFrequency;
  }
}