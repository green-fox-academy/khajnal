import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    List<Integer> listedNumbers = numbers.stream()
      .filter(x -> x * x > 20)
      .collect(Collectors.toList());
    System.out.println(listedNumbers);

    numbers.stream()
      .filter(x -> x * x > 20)
      .forEach(System.out::println);

    System.out.println(listedNumbersMethod(numbers));
    System.out.println(listedNumbersMethodOtherSolution(numbers));
  }

  public static List<Integer> listedNumbersMethod(ArrayList<Integer> example) {
    List<Integer> listedNumbers = new ArrayList<>();
    for (Integer oneElement : example) {
      if (oneElement * oneElement > 20) {
        listedNumbers.add(oneElement);
      }
    }
    return listedNumbers;
  }

  public static List<Integer> listedNumbersMethodOtherSolution(ArrayList<Integer> example) {
    return example.parallelStream()
      .filter(x -> x * x > 20)
      .collect(Collectors.toList());
  }
}