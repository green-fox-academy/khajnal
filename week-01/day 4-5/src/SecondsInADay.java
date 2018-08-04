public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int remainingSecs = ((24 - currentHours - 1) * 60 * 60) + ((60 - currentMinutes - 1) * 60) + (60 - currentSeconds);
//    The following statement prints the remaining seconds from the day.
    System.out.println(remainingSecs);
  }
}
