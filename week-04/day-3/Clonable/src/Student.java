public class Student extends Person implements Cloneable {
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

  public Student clone() {
    Student clone = new Student();
    clone.name = this.name;
    clone.age = this.age;
    clone.gender = this.gender;
    clone.skippedDays = this.skippedDays;
    clone.previousOrganization = this.previousOrganization;
    return clone;
  }
}