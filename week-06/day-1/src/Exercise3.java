import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    List<Integer> positiveNumbers = numbers.stream()
      .filter(x -> x > 0)
      .collect(Collectors.toList());
    System.out.println(positiveNumbers);

    List<Integer> squaredPositiveNumbers = numbers.stream()
      .filter(x -> x > 0)
      .map(x -> x * x)
      .collect(Collectors.toList());
    System.out.println(squaredPositiveNumbers);

    System.out.println(squaredPositiveNumbersMethod(numbers));
    System.out.println(squaredPositiveNumbersMethodOtherSolution(numbers));
  }

  public static List<Integer> squaredPositiveNumbersMethod(ArrayList<Integer> example) {
    List<Integer> squaredPositiveNumbers = new ArrayList<>();
    for (Integer oneElement : example) {
      if (oneElement > 0) {
        squaredPositiveNumbers.add(oneElement * oneElement);
      }
    }
    return squaredPositiveNumbers;
  }

  public static List<Integer> squaredPositiveNumbersMethodOtherSolution(ArrayList<Integer> example) {
    return example.stream()
      .filter(x -> x > 0)
      .map(x -> x * x)
      .collect(Collectors.toList());
  }
}