import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    String fruit = "apple";
    Path filepath = Paths.get("/home/kriszti/Documents/Greenfox/fruitparty.txt");
    int lines = 5;
    writeLines(filepath, fruit, lines);
  }
  private static void writeLines(Path filepath, String fruit, int lines) {
    List<String> content = new ArrayList<>();
    for (int i = 0; i < lines; i++) {
      content.add(fruit);
    }
    try {
    Files.write(filepath, content);
    } catch (IOException a) {
      System.out.println("Not working, sorry");
    }
  }
}
