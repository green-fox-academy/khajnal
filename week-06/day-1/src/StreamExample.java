import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

  /*Stream always has a source, which provides the elements.
   *Second part of the stream is the operations that need to be performed on that stream.
   *Finally the end condition, the terminal operation.
   */

  public static void main(String[] args) {
    List<Person> people = Arrays.asList(
      new Person("Charles", "Dickens", 60),
      new Person("Lewis", "Carroll", 42),
      new Person("Thomas", "Carlyle", 51),
      new Person("Charlotte", "Bronte", 45),
      new Person("Matthew", "Arnold", 39)
    );

    people.stream()
      .filter(p -> p.getLastName().startsWith("C"))
      .forEach(p -> System.out.println(p.getFirstName()));

    long count = people.stream()
      .filter(p -> p.getLastName().startsWith("C"))
      .count();

    System.out.println(count);
/*Second example:
 *The ‘filter’ method is used to eliminate elements based on a criteria.
 */

    List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
    List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
    System.out.println(filtered);

/*Third example:
 *The ‘limit’ method is used to reduce the size of the stream.
 */

    Random random = new Random();
    random.ints().limit(10).forEach(System.out::println);

/*Fourth example:
 *the ‘map’ method is used to map each element to its corresponding result.
 */

    List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
    //get list of unique squares
    List<Integer> squaresList = numbers.stream().map( i -> i * i).distinct().collect(Collectors.toList());
    System.out.println();
    System.out.println("Unique squares: ");
    System.out.println(squaresList);

/*Fifth example:
 *The ‘sorted’ method is used to sort the stream.
 */
    Random random2 = new Random();
    random2.ints().limit(10).sorted().forEach(System.out::println);

/* Sixth example:
 *parallelStream is the alternative of stream for parallel processing.
 */
    List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
    long count2 = strings.parallelStream().filter(string -> string.isEmpty()).count();
    System.out.println(count2);

/* Seventh example:
 *Collectors can be used to return a list or a string.
 */
    List<String> strings3 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
    List<String> filtered2 = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

    System.out.println("Filtered List: " + filtered2);
    String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
    System.out.println("Merged String: " + mergedString);

// Eighth example:

    List numbers2 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

    IntSummaryStatistics stats = numbers2.stream().mapToInt((i) -> (int) i).summaryStatistics();

    System.out.println("Highest number in List : " + stats.getMax());
    System.out.println("Lowest number in List : " + stats.getMin());
    System.out.println("Sum of all numbers : " + stats.getSum());
    System.out.println("Average of all numbers : " + stats.getAverage());

  }
}