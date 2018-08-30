import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
  public static void main(String[] args) {
    printContent("text/encoded-lines.txt");
  }

  public static List<String> readAllLines(String filename) {
    Path path = Paths.get(filename);
    List<String> decryptedLines = new ArrayList<>();
    try {
      decryptedLines = Files.readAllLines(path);
    } catch (Exception e) {
      System.out.println("Cannot read the file, because of: " + e);
    }
    return decryptedLines;
  }

  public static List<String> decryptContent(String filename)  {
    List<String> decryptedLines = readAllLines(filename);
    List<String> encryptedLines = new ArrayList<>();
    for (String oneLine : decryptedLines) {
      String decryptedLine = "";
      for (int i = 0; i < oneLine.length(); i++) {
        if (oneLine.charAt(i) != ' ') {
          decryptedLine += String.valueOf(Character.toChars(oneLine.charAt(i) - 1));
        } else {
          decryptedLine += ' ';
        }
      }
      encryptedLines.add(decryptedLine);
    }
    return encryptedLines;
  }

  public static void printContent(String filename) {
    List<String> encryptedLines = decryptContent(filename);
    for (String oneLine : encryptedLines) {
      System.out.println(oneLine);
    }
  }
}