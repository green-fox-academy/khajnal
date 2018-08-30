import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
  public static void main(String[] args) {
    Path destPath = Paths.get("texts/decrypted-encode.txt");
    List<String> decryptedLines = new ArrayList<>();
  }

  public List<String> readAllLines(String filename) {
    Path path = Paths.get(filename);
    List<String> decryptedLines = new ArrayList<>();
    try {
      decryptedLines = Files.readAllLines(path);
    } catch (Exception e) {
      System.out.println("Cannot read the file, because of: " + e);
    }
    return decryptedLines;
  }

  public List<String> encodeContent(String filename)  {
    List<String> decryptedLines = readAllLines(filename);
    List<String> encryptedLines = new ArrayList<>();
    for (String oneLine : decryptedLines) {

    }
  }
}