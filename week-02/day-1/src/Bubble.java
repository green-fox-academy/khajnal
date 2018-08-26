import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bubble {
  public static void main(String[] args) {
    System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
    System.out.println(advancedBubble(new int[]{34, 12, 24, 9, 5}, true));
    //  should print [34, 24, 12, 9, 5]
  }

  private static List<Integer> advancedBubble(int[] array, boolean b) {
    List<Integer> sortedList = bubble(array);
    List<Integer> reversedIfTrue = new ArrayList<>();
    if (b == true) {
      for (int i = sortedList.size() - 1; i >= 0; i--) {
        reversedIfTrue.add(sortedList.get(i));
      }
    } else {
      reversedIfTrue = sortedList;
    }
  return reversedIfTrue;
}

  public static List<Integer> bubble(int[] array) {
    Integer[] arrayObject = new Integer[array.length];
    for(int i = 0; i < array.length; i++) {
      arrayObject[i] = Integer.valueOf(array[i]);
    }
    List<Integer> listInt = new ArrayList<>();
    Collections.addAll(listInt, arrayObject);
    Collections.sort(listInt);
    return listInt;
  }
}
