import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {
  public static void main(String[] args) {
    String poem = "Tyger Tyger, burning bright, In the forests of the night";

    List<Character> upperCaseLetters = poem.chars()
      .filter(Character::isUpperCase)
      .mapToObj(c -> (char) c)
      .collect(Collectors.toList());

    System.out.println(upperCaseLetters);

    String mergedString = poem.chars()
      .filter(Character::isUpperCase)
      .mapToObj(c -> String.valueOf((char) c))
      .collect(Collectors.joining(", "));

    System.out.println(mergedString);

    System.out.println(upperCaseLettersMethod(poem));
    System.out.println(upperCaseLettersMethodOtherSolution(poem));
  }

  public static List<Character> upperCaseLettersMethod(String example) {
    List<Character> upperCaseLetters = new ArrayList<>();
    for (Character oneChar : example.toCharArray()) {
      if (Character.isUpperCase(oneChar)) {
        upperCaseLetters.add(oneChar);
      }
    }
    return upperCaseLetters;
  }

  public static List<Character> upperCaseLettersMethodOtherSolution(String example) {
    return example.chars()
      .filter(Character::isUpperCase)
      .mapToObj(c -> (char) c)
      .collect(Collectors.toList());
  }
}