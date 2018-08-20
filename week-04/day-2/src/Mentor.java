public class Mentor {
  String name;
  int age;
  String gender;
  String level;


  public Mentor(String name, int age, String maleOrFemale, String level) {
    this.name = name;
    this.age = age;
    gender = maleOrFemale;
    this.level = level;
  }

  public Mentor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    level = "intermediate";
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + " , a " + age + " year old " + gender + ", " + level + " mentor");
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
