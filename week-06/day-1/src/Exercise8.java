import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise8 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    Map<Integer, Long> nrFrequency = numbers.stream()
      .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
    System.out.println(nrFrequency);

    System.out.println(nrFrequencyMethod(numbers));
  }

  private static Map<Integer, Integer> nrFrequencyMethod(ArrayList<Integer> example) {
    Map<Integer, Integer> nrFrequency = new HashMap<>();
    for (Integer oneElement : example) {
      if (!nrFrequency.containsKey(oneElement)) {
        nrFrequency.put(oneElement, 1);
      } else {
        nrFrequency.put(oneElement, nrFrequency.get(oneElement) + 1);
      }
    }
    return nrFrequency;
  }
}