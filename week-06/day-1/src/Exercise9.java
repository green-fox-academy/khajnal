import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise9 {
  public static void main(String[] args) {
    char[] charArray = {'a', 'c', 'd', 'j', 'o', 'm', 'o', 'k', 'a'};

    String mergedCharArray = Arrays.asList(charArray).stream()
      .map(x ->  String.valueOf(x))
      .collect(Collectors.joining());

    System.out.println(mergedCharArray);
  }
}