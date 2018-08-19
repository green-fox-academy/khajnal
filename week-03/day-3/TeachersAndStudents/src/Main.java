public class Main {
  public static void main(String[] args) {
    Student bela = new Student("Bela", 2);
    Teacher magdi = new Teacher("Magdi", 50);

    bela.learn();
    bela.question(magdi);
    bela.getInfoStudent();
    magdi.getInfoTeacher();
  }
}
