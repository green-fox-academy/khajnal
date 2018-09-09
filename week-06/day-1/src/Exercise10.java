import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {
  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<>(Arrays.asList(new Fox("bob", "fennec", "red"),
                                                    new Fox("bud", "red", "red"),
                                                    new Fox("bill", "marble", "white"),
                                                    new Fox("bell", "pallida", "green"),
                                                    new Fox("becky", "pallida", "orange"),
                                                    new Fox("betty", "marble", "green"),
                                                    new Fox("bobby", "pallida", "green")));

//    List<Fox> greenFoxes = foxes.stream()
//      .filter(fox -> fox.getcolor().equals("green"))
//      .collect(Collectors.toList());
//    System.out.println(greenFoxes);

    List<String> greenFoxes = foxes.stream()
      .filter(fox -> fox.getcolor().equals("green"))
      .map(Fox::getName)
      .collect(Collectors.toList());

    System.out.println(greenFoxes);

    List<String> greenFoxesWithPalindaType = foxes.stream()
      .filter(fox -> fox.getcolor().equals("green"))
      .filter(fox -> fox.getType().equals("pallida"))
      .map(Fox::getName)
      .collect(Collectors.toList());

    System.out.println(greenFoxesWithPalindaType);
  }
}