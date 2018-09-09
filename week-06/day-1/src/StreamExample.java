import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

  /*Stream always has a source, which provides the elements.
   Second part of the stream is the operations that need to be performed on that stream.
   Finally the end condition, the terminal operation.
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
// Second example:
    List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
    List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
    System.out.println(filtered);

//  Third example:

    Random random = new Random();
    random.ints().limit(10).forEach(System.out::println);
    
// Fourth example:
//      the ‘map’ method is used to map each element to its corresponding result.
//      the following code segment prints unique squares of numbers using map.

    List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
    //get list of unique squares
    List<Integer> squaresList = numbers.stream().map( i -> i * i).distinct().collect(Collectors.toList());
    System.out.println();
    System.out.println("Unique squares: ");
    System.out.println(squaresList);
  }
}