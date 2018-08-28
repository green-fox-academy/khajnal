import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lottery {
  public static void main(String[] args) {
    System.out.println(commonLotteryNumbers());
  }

  private static Map<String,Integer> commonLotteryNumbers() {
    List<String> lines = new ArrayList<>();
    Map<String, Integer> numbers = new HashMap<>();
    try {
      Path path = Paths.get("text/lottery.csv");
      lines = Files.readAllLines(path);
    } catch (Exception e) {
      System.out.println("Cannot read the file");
    }
      for (int i = 0; i < lines.size(); i++) {
        String[] splittedLine = lines.get(i).split(";");
        for (int j = 1; j < 6; j++) {
          String oneNumber = splittedLine[splittedLine.length - j];
          if (!numbers.containsKey(oneNumber)) {
            numbers.put(oneNumber, 1);
          } else {
            int temp = numbers.get(oneNumber);
            numbers.put(oneNumber, temp + 1);
          }
        }
      }
    return numbers;
  }
}
