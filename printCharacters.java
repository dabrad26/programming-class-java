package bradshawlab1;

       //import java.util.Arrays;
       import javax.swing.JOptionPane;
       //import javax.swing.JOptionPane;

public class printCharacters {



    public static void main(String[] args) {

    String character1 = JOptionPane.showInputDialog("Enter First Letter: ");
    char ch1 = character1.charAt(0);

    String character2 = JOptionPane.showInputDialog("Enter Last Letter: ");
    char ch2 = character2.charAt(0);

    String number2 = JOptionPane.showInputDialog("Enter number of characters per line: ");
    int numberPerLine = Integer.parseInt(number2);

    printChars(ch1, ch2, numberPerLine);



    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {

        for(;(int)ch1 <= (int)ch2;){

            for(int j=1; j <= numberPerLine; j++){
            System.out.print(" " + (char)ch1);
            ch1++;
            if(ch1 > ch2){
                break;

            }
            }
            

            System.out.println("");

        }

    }
}




