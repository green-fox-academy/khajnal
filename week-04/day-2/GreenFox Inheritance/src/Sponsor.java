public class Sponsor extends Person {
  String company;
  int hiredStudents;

  public Sponsor(String name, int age, String maleOrFemale, String company) {
    super(name, age, maleOrFemale);
    this.company = company;
    hiredStudents = 0;
  }

  public Sponsor() {
    company = "Google";
    hiredStudents = 0;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + " , a " + age + " years old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public int hire() {
    return hiredStudents++;
  }
}