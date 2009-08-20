package bradshawlab1;
        import javax.swing.JOptionPane;
public class ClassAveragePerStudent {

    public static void main(String[] args) {
    // Retrieve User Input
    String students = JOptionPane.showInputDialog("How many students are their? ");
    int studentNum = Integer.parseInt(students);

    String exams = JOptionPane.showInputDialog("How many exams were taken? ");
    int examNum = Integer.parseInt(exams);
    
    //Students in the class
    for(int num=0; num < studentNum; num++) {

        int score=0;

        String student1 = JOptionPane.showInputDialog("Enter student name: ");

        for(int num1=0; num1 < examNum; num1++) {

        String score1 = JOptionPane.showInputDialog("Enter Exam score: ");
            int scoreNew = Integer.parseInt(score1);

            score = (score + scoreNew);
        }
        
        int gradeAverage = score/examNum;
    JOptionPane.showMessageDialog(null, student1 + "'s average is: " + gradeAverage + "\n This student is complete, move on to the next one");
    System.out.println(gradeAverage);
    
    }

    JOptionPane.showMessageDialog(null, "YAY! That is all the students! \n Program will now EXIT");

    }
}