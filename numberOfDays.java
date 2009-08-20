package bradshawlab1;

       //import java.util.Arrays;
       import javax.swing.JOptionPane;
       //import javax.swing.JOptionPane;

public class numberOfDays {



    public static void main(String[] args) {

    String number2 = JOptionPane.showInputDialog("Enter a Year: ");
    int year = Integer.parseInt(number2);

    JOptionPane.showMessageDialog(null, "Number of Days: " + numberOfDaysInAYear(year));

    }

    public static int numberOfDaysInAYear(int year) {

        if((year%400 == 0) || ((year%4 == 0) && (year%100 != 0))){
            return 366;

        }
        else{
            return 365;
        }

        
        }

    }