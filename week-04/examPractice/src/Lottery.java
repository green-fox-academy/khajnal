import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Lottery {
  public static void main(String[] args) {
    commonLotteryNumbers();
  }

  private static List<Integer> commonLotteryNumbers() {
    try {
      Path path = Paths.get("/text/lottery.csv");
      List<String> lines = Files.readAllLines(path);
    } catch (Exception e) {
      System.out.println("Cannot read the file");
      for (int i = 0; i < ; i++) {
        
      }
    }
    return
  }
}
