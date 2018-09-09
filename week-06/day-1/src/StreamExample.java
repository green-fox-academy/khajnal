import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

  //Stream always has a source, which provides the elements.
  // Second part of the stream is the operations that need to be perfomed on that stream.
  //Finally the end condition, the terminal operation.
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
  }
}