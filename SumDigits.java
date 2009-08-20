package bradshawlab1;

        import javax.swing.JOptionPane;

public class SumDigits {

    public static void main(String[] args) {

        // Retrieve User Input
    String user = JOptionPane.showInputDialog("Enter a string of numbers: ");
    long n = Integer.parseInt(user);

    int answer = sumDigit(n);
    String output = "The sum is: " + answer;

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);;



    }
    //Perform Calculation
    public static int sumDigit(long n){

        int sum = 0;
        for(;n > 0;){

            sum += n%10;

            n = n/10;

        }

        return sum;

        }
    
}