public class CodingHours {
  public static void main(String[] args) {
    double averageCodingHours = 6;
    int semesterWeeks = 17;
    int days = 5;

// The following statement prints the total amount of coding hours during the semester.
    System.out.println(days * (int) averageCodingHours * semesterWeeks);

    int weeklyWorkingHours = 52;
// The following statement prints the percentage of coding hours from the working hours during the semester.
    System.out.println(averageCodingHours * days / weeklyWorkingHours * 100 + "%");
  }
}