import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuoteSwap {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
    System.out.println(quoteSwap(list));
  }
  public static String quoteSwap(ArrayList example) {
    Collections.swap(example, 2, 5);
    String exampleString = "";
    for (int i = 0; i < example.size(); i++) {
      exampleString += example.get(i);
      exampleString += (' ');
    }
    return exampleString;
  }
}
