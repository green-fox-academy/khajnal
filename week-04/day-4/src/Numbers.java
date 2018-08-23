import java.util.ArrayList;
import java.util.List;

public class Numbers {
  private List<Integer> listOfNumbers = new ArrayList<>();

  public Numbers() {
  }

  public void addToList(Integer number) {
    listOfNumbers.add(number);
  }

  public int sizeOfList() {
    return listOfNumbers.size();
  }

  public int sum() {
    int sum = 0;
    for (int i = 0; i < listOfNumbers.size(); i++) {
      sum += listOfNumbers.get(i);
    } return sum;
  }
}