import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {
  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<>(Arrays.asList(new Fox("bob", "fennec", "red"),
                                                    new Fox("bud", "red", "red"),
                                                    new Fox("bill", "marble", "white"),
                                                    new Fox("bell", "pallinda", "green"),
                                                    new Fox("becky", "pallinda", "orange"),
                                                    new Fox("bobby", "pallinda", "green")));

//    List<Fox> greenFoxes = foxes.stream()
//      .filter(fox -> fox.getcolor().equals("green"))
//      .collect(Collectors.toList());
//    System.out.println(greenFoxes);

    List<String> greenFoxes = foxes.stream()
      .filter(fox -> fox.getcolor().equals("green"))
      .map(Fox::getName)
      .collect(Collectors.toList());

    System.out.println(greenFoxes);
  }
}