import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    String fruit = "apple";
    Path filePath = Paths.get("/home/kriszti/Documents/Greenfox/fruitparty.txt");
    int lines = 5;
    writeLines(filePath, fruit, lines);
  }
  private static void writeLines(Path filePath, String fruit, int lines) {
    List<String> content = new ArrayList<>();
    for (int i = 0; i < lines; i++) {
      content.add(fruit);
    }
    try {
    Files.write(filePath, content);
    } catch (IOException a) {
      System.out.println("Not working, sorry");
    }
  }
}
