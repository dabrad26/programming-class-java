package bradshawlab1;
        import javax.swing.JOptionPane;
public class ClassAverage {

    public static void main(String[] args) {
    // Retrieve User Input
    String exams = JOptionPane.showInputDialog("How many exams were taken? ");
    int examNum = Integer.parseInt(exams);
    
    int score = 0;
    int gradeAverage;

    for(int num=0; num < examNum; num++) {

        String score1 = JOptionPane.showInputDialog("Enter Exam score: ");
            int scoreNew = Integer.parseInt(score1);

            score = (score + scoreNew);

    }

    gradeAverage = score /examNum;

        System.out.println("Your average score is: " + gradeAverage);
 
    JOptionPane.showMessageDialog(null, "Your average score is: " + gradeAverage);
    System.out.println(gradeAverage);
    }
  }