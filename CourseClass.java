package bradshawlab;

//David Bradshaw Excercise 9.9

import java.util.*;

public class CourseClass {

  private String courseName;
  private ArrayList students = new ArrayList();

  public CourseClass(String courseName) {
    this.courseName = courseName;
  }

  public void addStudent(String student) {
    students.add(student);

}

  public String getStudents() {
    return students.toString();
  }

  public int getNumberOfStudents() {
    return students.size();
  }

  public String getCourseName() {
    return courseName;
  }

  public void dropStudent(String student) {
   students.remove(student);
   }

  public void clear() {
      students.clear();
      }
  }