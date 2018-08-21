public class Mentor extends Person {
  String level;


  public Mentor(String name, int age, String maleOrFemale, String level) {
    super(name, age, maleOrFemale);
    this.level = level;
  }

  public Mentor() {
    level = "intermediate";
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + " , a " + age + " years old " + gender + ", " + level + " mentor.");
  }

  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }
}