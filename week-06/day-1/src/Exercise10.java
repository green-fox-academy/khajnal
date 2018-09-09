import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise10 {
  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<>(Arrays.asList(new Fox("bob", "fennec", "red"),
                                                    new Fox("bud", "red", "red"),
                                                    new Fox("bill", "marble", "white"),
                                                    new Fox("bell", "pallinda", "green"),
                                                    new Fox("becky", "pallinda", "orange"),
                                                    new Fox("bobby", "pallinda", "green")));

    List<Fox> = foxes.stream()
      .filter();
  }
}
