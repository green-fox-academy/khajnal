import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    String filename = "text/reversedLines.csv";
    List<String> decrypted = decryptReversedLines(filename);
    for (int i = 0; i < decrypted.size(); i++) {
      System.out.println(decrypted.get(i));
    }
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
    char oneLetter = '*';
    String oneLine = "";
    for (int i = 0; i < encryptedText.size(); i++) {
      oneLine = "";
      for (int j = encryptedText.get(i).length() - 1; j >= 0; j--) {
        oneLetter = encryptedText.get(i).charAt(j);
        oneLine += oneLetter;
      }
      decryptedText.add(oneLine);
    }
    return decryptedText;
  }
}
