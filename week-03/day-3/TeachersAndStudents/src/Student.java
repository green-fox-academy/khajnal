public class Student {
  String name;
  int grade;

  public Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }
  public void learn() {
    grade ++;
  }
  public void question (Teacher teacher) {
    teacher.answer();
  }
  public void getInfoStudent() {
    System.out.println("My current grade: " + grade);
  }
}
