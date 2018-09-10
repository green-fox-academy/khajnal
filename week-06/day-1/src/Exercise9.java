import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
    char[] charArray = {'a', 'c', 'd', 'j', 'o', 'm', 'o', 'k', 'a'};

    String mergedCharArray = Arrays.asList(charArray).stream()
      .map(x -> String.valueOf(x))
      .collect(Collectors.joining());
    System.out.println(mergedCharArray);

    System.out.println(mergedCharArrayMethod(charArray));
    System.out.println(mergedCharArrayMethodOtherSolution(charArray));

    String result = new String(charArray);
    System.out.println(result);
  }

  public static String mergedCharArrayMethod(char[] example) {
    String mergedCharArray = "";
    for (char oneChar : example) {
      mergedCharArray += oneChar;
    }
    return mergedCharArray;
  }

  public static String mergedCharArrayMethodOtherSolution(char[] example) {
    return Arrays.asList(example).stream()
      .map(x -> String.valueOf(x))
      .collect(Collectors.joining(", "));
  }
}