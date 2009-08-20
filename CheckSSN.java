package bradshawlab1;

//David Bradshaw    8.1 Checking SSN
//import java.util.Arrays;
import javax.swing.JOptionPane;
//import java.util.Scanner;
//import java.lang.String;
public class CheckSSN {

    public static void main(String[] args) {


    String ssn = JOptionPane.showInputDialog("Enter your Social Security Number" + "\nUse 123-45-6789 format");
    String socialSecurity = String.valueOf(ssn);


    if(validSSN(socialSecurity)){
        JOptionPane.showMessageDialog(null, "That is a valid Social Security Number!");
    }
    else{
        JOptionPane.showMessageDialog(null, "That is not a valid Social Security Number! \nTry Again");
    }

    }

    public static Boolean validSSN(String socialSecurity){

        if((socialSecurity.length() == 11) && (socialSecurity.charAt(3) == '-') && (socialSecurity.charAt(6) == '-')){

            return true;
        }
        else{
            return false;
        }
    }
}
