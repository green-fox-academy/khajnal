public class Sponsor {
  String name;
  int age;
  String gender;
  String company;
  int hiredStudents;

  public Sponsor(String name, int age, String maleOrFemale, String company) {
    this.name = name;
    this.age = age;
    gender = maleOrFemale;
    this.company = company;
    hiredStudents = 0;
  }

  public Sponsor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
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
