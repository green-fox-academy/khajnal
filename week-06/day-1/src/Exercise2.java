import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    List<Integer> oddNrs = numbers.stream()
      .filter(x -> x % 2 != 0)
      .collect(Collectors.toList());

    double oddNrsAverage = oddNrs.stream()
      .mapToInt(x -> x)
      .average().getAsDouble();

    System.out.println(oddNrsAverage);

    double oddNrsAverage2 = numbers.stream()
      .filter(x -> x % 2 != 0)
      .mapToInt(x -> x)
      .average().getAsDouble();

    System.out.println(oddNrsAverage2);
  }
}