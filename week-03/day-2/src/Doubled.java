import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    Path filePath = Paths.get("/home/kriszti/Documents/Greenfox/duplicated-chars.txt");
    List<String> encrypted = new ArrayList<>();

    try {
      encrypted = Files.readAllLines(filePath);
    } catch (IOException a) {
      System.out.println("Nope");
    }
  }
}