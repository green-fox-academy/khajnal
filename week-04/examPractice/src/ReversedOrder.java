import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    String filename = "text/reversedOrder.csv";
    List<String> decryptedText = reversedOrder(filename);
    for (int i = 0; i < decryptedText.size() ; i++) {
      System.out.println(decryptedText.get(i));
    }
  }

  private static List<String> reversedOrder(String filename) {
    List<String> encryptedText = new ArrayList<>();
    List<String> decryptedText = new ArrayList<>();
    try {
      Path path = Paths.get(filename);
      encryptedText = Files.readAllLines(path);
    } catch (Exception e) {
      System.out.println("Cannot read the file");
    }
    for (int i = encryptedText.size() - 1; i >= 0; i--) {
        decryptedText.add(encryptedText.get(i));
      }
    return decryptedText;
  }
}
