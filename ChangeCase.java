package bradshawlab1;

        import javax.swing.JOptionPane;

public class ChangeCase {

    public static void main(String[] args) {

        // Retrieve User Input
    String user = JOptionPane.showInputDialog("Enter an Uppercase letter: ");
    char ch = user.charAt(0);

    char newCase = (char)changeCase(ch);
    String output = "The lower case is: " + newCase;

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);;



    }
    //Change from uppercase to lower case
    public static double changeCase(char ch){

        int offset = (int)'a' - (int)'A';



                ch = (char)(ch + offset);

                return ch;

        }
    
}