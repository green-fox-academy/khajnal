import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter {
  public static void main(String[] args) {
    List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
    System.out.println(appendA(far));
  }
  public static ArrayList<String> appendA(List<String> animals) {
    ArrayList<String> animalsWithA = new ArrayList<>();
    for (int i = 0; i < animals.size(); i++) {
      animalsWithA.add(animals.get(i) + 'a');
    }
    return animalsWithA;
  }
}