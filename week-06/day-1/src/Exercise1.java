import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    List<Integer> evenNumbers = numbers.stream()
      .filter(x -> x % 2 == 0)
      .collect(Collectors.toList());
    System.out.println(evenNumbers);

    numbers.stream()
      .filter(x -> x % 2 == 0)
      .forEach(System.out::println);

    System.out.println("With parallelStream: ");
    numbers.parallelStream()
      .filter(x -> x % 2 == 0)
      .forEach(System.out::println);

    System.out.println(evenNumbers(numbers));
    System.out.println(evenNumbersOtherSolution(numbers));
  }

  public static List<Integer> evenNumbers(List<Integer> example) {
    List<Integer> evenNumbers = new ArrayList<>();
    for (Integer oneElement : example) {
      if (oneElement % 2 == 0) {
        evenNumbers.add(oneElement);
      }
    }
    return evenNumbers;
  }

  public static List<Integer> evenNumbersOtherSolution(List<Integer> example) {
    return example.stream()
      .filter(n -> n % 2 != 0)
      .collect(Collectors.toList());
  }
}