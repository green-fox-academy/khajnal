import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    String filename = "text/reversedLines.csv";
    decryptReversedLines(filename);
  }

  private static List<String> decryptReversedLines(String filename) {
    List<String> encryptedText = new ArrayList<>();
    List<String> decryptedText = new ArrayList<>();
    try {
      Path path = Paths.get(filename);
      encryptedText = Files.readAllLines(path);
    } catch (Exception e) {
      System.out.println("Cannot read the file");
    }

    
    return
  }

}
