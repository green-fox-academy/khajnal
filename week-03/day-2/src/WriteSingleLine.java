import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteSingleLine {
  public static void main(String[] args) {
    Path filepath = Paths.get("/home/kriszti/Documents/Greenfox/my-file.txt");
    ArrayList<String> content = new ArrayList<>();
    content.add("Kriszti");
    try {
      Files.write(filepath, content);
      System.out.println(Files.readAllLines(filepath));
    } catch (IOException a) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}
