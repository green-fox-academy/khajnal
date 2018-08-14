import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    Path filePath = Paths.get("/home/kriszti/Documents/Greenfox/log.txt");
    List<String> content = new ArrayList<>();

    try {
      content = Files.readAllLines(filePath);
    } catch (IOException a) {
      System.out.println("Something went wrong");
    }
    System.out.println(uniqListMaker(content));
    System.out.println(getPostRatio(content));
  }

  private static double getPostRatio(List<String> content) {
    List<String> lines = new ArrayList<>();
    for (int i = 0; i < content.size(); i++) {
      String[] lines = content.get(i).split("   ");
      if (lines[2].contains("GET")) {
      }
    }
  }

  private static List<String> uniqListMaker(List<String> content) {
    List<String> uniqIps = new ArrayList<>();
    for (int i = 0; i < content.size(); i++) {
      String[] lines = content.get(i).split("   ");
      if (!uniqIps.contains(lines[1])) {
        uniqIps.add(lines[1]);
      }

    }
    return uniqIps;
  }
}
