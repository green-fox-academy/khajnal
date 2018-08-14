import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
  public static void main(String[] args) {
    Path filePath = Paths.get("/home/kriszti/Documents/Greenfox/my-file.txt");
    System.out.println(countLines(filePath));
  }
  private static int countLines(Path filePath) {
    try {
      return Files.readAllLines(filePath).size();
    } catch (IOException a) {
      return 0;
    }
  }
}
