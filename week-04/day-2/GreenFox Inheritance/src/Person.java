public class Person {
  String name;
  int age;
  String gender;

  public Person(String name, int age, String maleOrFemale) {
    this.name = name;
    this.age = age;
    gender = maleOrFemale;
  }

  public Person() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + " , a " + age + " years old " + gender + ".");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}