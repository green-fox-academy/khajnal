import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintEachLine {
  public static void main(String[] args) {
    try {
      Path filepath = Paths.get("/home/kriszti/Documents/Greenfox/my-file.txt");
      System.out.println(Files.readAllLines(filepath));
    } catch (IOException a) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}
