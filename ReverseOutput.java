package bradshawlab1;


        import javax.swing.JOptionPane;

public class ReverseOutput {

    public static void main(String[] args) {

        // Retrieve User Input
    String user = JOptionPane.showInputDialog("Enter a string of numbers: ");
    int n = Integer.parseInt(user);

    reverse(n);




    }
    //Perform Calculation
    public static void reverse(int n){

int answer;
        System.out.println("The Reversed number is: ");

        for(;n > 0;){

            answer = n%10;

            System.out.print("" + answer);

            n = n/10;

        }

        System.out.println("\n");
        }
    
}