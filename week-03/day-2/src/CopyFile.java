import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  public static void main(String[] args) {
    Path filePathA = Paths.get("/home/kriszti/Documents/Greenfox/originalFile.txt");
    Path filePathB = Paths.get("/home/kriszti/Documents/Greenfox/copyFile.txt");
    copyFile(filePathA, filePathB);
  }
}
