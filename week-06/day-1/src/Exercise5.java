import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {
  public static void main(String[] args) {
    String poem = "Tyger Tyger, burning bright, In the forests of the night";

    List<Character> upperCaseLetters = poem.chars()
      .filter(Character :: isUpperCase)
      .mapToObj(Character -> (char) Character)
      .collect(Collectors.toList());

    System.out.println(upperCaseLetters);

    String mergedString = poem.chars()
      .filter(Character :: isUpperCase)
      .mapToObj(Character -> String.valueOf((char)Character))
      .collect(Collectors.joining(", "));

    System.out.println(mergedString);
  }
}