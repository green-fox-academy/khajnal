import java.util.List;

public class Cohort {
  String name;
  List students;
  List mentors;

}
  Create a Cohort class that has the following
    methods:
    addStudent(Student): adds the given Student to students list
    addMentor(Mentor): adds the given Mentor to mentors list
    info(): prints out "The name cohort has students.size() students and mentors.size() mentors."
    The Cohort class has the following constructors:

    Cohort(name): beside the given parameter, it sets students and mentors as empty lists
