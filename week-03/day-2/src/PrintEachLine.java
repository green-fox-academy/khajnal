import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    try {
      Path filepath = Paths.get(~/Documents/Greenfox/my-file.txt);
      System.out.println(Files.readAllLines(filepath));
    } catch () {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}
