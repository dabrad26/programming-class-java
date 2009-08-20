package bradshawlab1;


        import javax.swing.JOptionPane;

public class SortNumbers {

    public static void main(String[] args) {

        // Retrieve User Input
    String number1 = JOptionPane.showInputDialog("Enter your first number: ");
    double num1 = Integer.parseInt(number1);

    String number2 = JOptionPane.showInputDialog("Enter your second number: ");
    double num2 = Integer.parseInt(number2);

    String number3 = JOptionPane.showInputDialog("Enter your third number: ");
    double num3 = Integer.parseInt(number3);

    sort(num1, num2, num3);

    }
    
    //Perform Calculation
    public static void sort(double num1, double num2, double num3){

    if(num3 > num2 && num2 > num1){

    String output = "The order of numbers is: " + num1 + " " + num2 + " "+ num3;

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);;

        }

    else if(num3 > num1 && num1 > num2){

    String output = "The order of numbers is: " + num2 + " " + num1 + " "+ num3;

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);;

        }

    else if(num1 > num3 && num3 > num2){

    String output = "The order of numbers is: " + num2 + " " + num3 + " "+ num1;

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);;

        }
    else if(num2 > num1 && num1 > num3){

    String output = "The order of numbers is: " + num3 + " " + num1 + " "+ num2;

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);;

        }

    else if(num1 > num2 && num2 > num3){

    String output = "The order of numbers is: " + num3 + " " + num2 + " "+ num1;

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);;

        }

    else if(num2 > num3 && num3 > num1){

    String output = "The order of numbers is: " + num1 + " " + num3 + " "+ num2;

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);;

        }
        }
    
}