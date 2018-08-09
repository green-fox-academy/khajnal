import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
  public static void main(String[] args) {
    List<Integer> aj = new ArrayList(Arrays.asList(3, 4, 5, 6, 7));
    List<Integer> ajReversed = new ArrayList<>();
    for (int i = 1; i <= aj.size(); i++) {
      ajReversed.add(aj.get(aj.size() - i));
    }


    int [] ajj = {3, 4, 5, 6, 7};
    int [] ajjReversed = new int[ajj.length];
    for (int i = 0; i < ajj.length; i++) {
      ajjReversed [i] = ajj[(ajj.length - 1) - i];
    }

    System.out.println(ajReversed);
    System.out.println(Arrays.toString(ajjReversed));
  }
}