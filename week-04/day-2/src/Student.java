public class Student {
  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;

  public Student(String name, int age, String maleOrFemale, String previousOrganization) {
    this.name = name;
    this.age = age;
    gender = maleOrFemale;
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
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
