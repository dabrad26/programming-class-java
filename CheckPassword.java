package bradshawlab;

//David Bradshaw    8.3 Checking Password

//import java.util.Arrays;
import javax.swing.JOptionPane;
//import java.util.Scanner;
//import java.lang.String;
public class CheckPassword {

    public static void main(String[] args) {


    String password = JOptionPane.showInputDialog("Please Enter a Password: ");

    if(validPassword(password)){
        JOptionPane.showMessageDialog(null, "That is a valid Password!");
    }
    else{
        JOptionPane.showMessageDialog(null, "That is not a valid Password! \nTry Again");
    }

    }

    public static Boolean validPassword(String password){

        if((password.length() >= 8) && checkCharacters(password) && checkDigit(password)) {

            return true;
        }
        else{
            return false;
        }
    }

    public static Boolean checkCharacters(String password){

        String validCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

        for(int i=0; i<password.length(); i++){
               String test = Character.toString(password.charAt(i));

            if (validCharacters.contains(test) == false){
                return false;
            }
}
        return true;
}
    public static Boolean checkDigit(String password){

        int numberOfDigits = 0;
          for(int i=0; i<password.length(); i++){

               if(Character.isDigit(password.charAt(i))){

                   numberOfDigits += 1;

               }
            }
        
        if(numberOfDigits > 1){
            return true;
        }
        else{
            return false;
        }
    }
}