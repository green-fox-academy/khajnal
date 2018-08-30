import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Poem {
  public static void main(String[] args) {
    System.out.println(countFiveLenghtWord("texts/poem.txt"));
    System.out.println(countFiveLettersWithRegExpress("texts/poem.txt"));
  }

  public static List<String> readAllLines(String filename) {
    List<String> allLines = new ArrayList<>();
    try {
      Path path = Paths.get(filename);
      allLines = Files.readAllLines(path);
    } catch (Exception e) {
      System.out.println("Cannot read the file, exception: " + e);
    }
    return allLines;
  }

  public static int countFiveLenghtWord(String filename) {
    List<String> allLines = readAllLines(filename);
    int sum = 0;
    for (String oneLine : allLines) {
      oneLine.replace(",", "");
      oneLine.replace("?", "");
      oneLine.replace(";", "");
      oneLine.replace(".", "");
      String[] splittedOneLine = oneLine.split(" ");
      for (String oneWord : splittedOneLine) {
        if (oneWord.length() == 5) {
          sum++;
        }
      }
    }
    return sum;
  }

//  public static int countAWord(String filename, String word) {
//    List<String> allLines = readAllLines(filename);
//    int sum
//  }

  public static int countFiveLettersWithRegExpress(String filename){
    List<String> allLines = readAllLines(filename);
    Pattern pattern = Pattern.compile("\\b[a-zA-Z]{5}\\b");
    int sum = 0;
    for (String line : allLines) {
      Matcher matcher = pattern.matcher(line);
      while (matcher.find()) {
        sum += 1;
      }
    }
    return sum;
  }

  
}
