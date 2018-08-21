public class Student extends Person {
  String previousOrganization;
  int skippedDays;

  public Student(String name, int age, String maleOrFemale, String previousOrganization) {
    super(name, age, maleOrFemale);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + " , a " + age + " years old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  public int skipDays(int numberOfDays) {
    return skippedDays += numberOfDays;
  }
}