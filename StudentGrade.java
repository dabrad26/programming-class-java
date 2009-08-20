package bradshawlab1;
import java.util.Scanner;

public class StudentGrade {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the number of students
    System.out.print(
      "Enter the number of students: ");
    int numOfStudents = input.nextInt();

    System.out.print(
      "Enter a student name: ");
    String student1 = input.next();
    System.out.print(
      "Enter a student score: ");
    double score1 = input.nextDouble();

    System.out.print(
    "Enter a student name: ");
    String student2 = input.next();
    System.out.print(
      "Enter a student score: ");
    double score2 = input.nextDouble();

    for (int i = 0; i < numOfStudents - 2; i++) {
      System.out.print(
        "Enter a student name: ");
      String student = input.next();

      System.out.print(
        "Enter a student score: ");
      double score = input.nextDouble();

      if (score > score1) {
        student1 = student;
        score1 = score;
      }
      else if (score > score2) {
          student2 = student;
          score2 = score;
      }
    }

    System.out.println("Top student is " +
      student1 + "'s score is " + score1);

    System.out.println("Second Top student is " +
      student2 + "'s score is " + score2);
  }
}
