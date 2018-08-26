import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostProductiveYear {
  public static void main(String[] args) {
    String marvel = "marvel";
    String paramount = "paramount";
    String ghibli = "ghibli";
    System.out.println(mostProductiveYear(marvel));
    System.out.println(mostProductiveYear(paramount));
    System.out.println(mostProductiveYear(ghibli));
  }

  private static String mostProductiveYear(String studioName) {
    String mostProductive = "";
    if (studioName.equals("marvel")) {
      try {
        Path filePath = Paths.get("/home/kriszti/Documents/Greenfox/marvel.csv");
        List<String> lines = Files.readAllLines(filePath);
        mostProductive = "marvel has made the most movies in ";
      } catch (Exception e) {
        System.out.println("Something went wrong");
      }
    } else if (studioName.equals("paramount")) {
      try {
        Path filePath = Paths.get("/home/kriszti/Documents/Greenfox/paramount.csv");
        List<String> lines = Files.readAllLines(filePath);
        Map<String, Integer> yearCounter = new HashMap<>();

        for (int i = 0; i < lines.size(); i++) {
          String yearToCheck = lines.get(i).split(",")[1];
          if (!yearCounter.containsKey(yearToCheck)) {
            yearCounter.put(yearToCheck, 1);
          } else {
            Integer temp = yearCounter.get(yearToCheck);
            yearCounter.put(yearToCheck, temp + 1);
          }
        }
        String bestYear = "";
        for (String key : yearCounter.keySet()) {
          for (String keyTwo : yearCounter.keySet()) {
            if (yearCounter.get(key) > yearCounter.get(keyTwo)) {
              bestYear = key;
            }
          }
        }
        mostProductive = "paramount has made the most movies in ";
        mostProductive.concat(bestYear);
      } catch (Exception e) {
        System.out.println("Something went wrong");

      }
    } else {
      mostProductive = "Cannot find studio, please try again later.";
    }
    return mostProductive;
  }
}
//    * The method should try to open the related data file named `studioname`.csv,
//    * which is a comma separated file with 3 columns: name of the movie, release year, director
//    *
//    *  - If we do not have any data about the studio, the method should return an error message.
//    *  - If we have found data, the method should return an information message about the most productive year for that studio.

