import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    String filename = "text/reversedLines.csv";
    System.out.println(decryptReversedLines(filename));
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
      for (int j = encryptedText.get(i).length() - 1; j > 0; j--) {
        oneLetter = encryptedText.get(i).charAt(j);
        oneLine += oneLetter;
      }
      decryptedText.add(oneLine);
    }

    return decryptedText;
  }

}
