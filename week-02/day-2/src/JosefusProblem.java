import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JosefusProblem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number of players!");
    int allPeople = scanner.nextInt();
    int index = 0;

    List<Integer> everyoneList = new ArrayList<>();

    for (int i = 1; i <= allPeople; i++) {
      everyoneList.add(index, i);
      index += 1;
    }
    System.out.println(everyoneList);
  }
}
