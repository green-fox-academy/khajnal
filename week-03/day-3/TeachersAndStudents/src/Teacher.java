public class Teacher {
  String name;
  int energy;

  public Teacher(String name, int energy) {
    this.name = name;
    this.energy = energy;
  }
  public void answer() {
    energy--;
  }
  public void teach(Student student) {
    student.learn();
  }
  public void getInfoTeacher() {
    System.out.println("My energy level: " + energy);
  }
}
