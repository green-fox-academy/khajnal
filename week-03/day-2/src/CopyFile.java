import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  public static void main(String[] args) {
    Path filePathA = Paths.get("/home/kriszti/Documents/Greenfox/originalFile.txt");
    Path filePathB = Paths.get("/home/kriszti/Documents/Greenfox/copyFile.txt");
    System.out.println(copyFile(filePathA, filePathB));
  }
  private static boolean copyFile(Path original, Path copy) {
    try {
      Files.copy(original, copy);
      return true;
    } catch (IOException a) {
      return false;
    }
  }
}
