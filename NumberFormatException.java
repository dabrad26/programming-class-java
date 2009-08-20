package bradshawlab1;

//David Bradshaw    18.1 Number Format Exception
//import java.util.Arrays;
//import javax.swing.JOptionPane;
//import java.util.Scanner;
//import java.lang.String;
public class NumberFormatException {

    public static void main(String[] args) throws Exception {

        try {
            if (args.length != 3) {
                System.out.println("To use this program add arguments, format: num1 (operand) num2, enter!");
                System.exit(0);
            }

            int result = 0;

            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0])
                            + Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0])
                            - Integer.parseInt(args[2]);
                    break;
                case '*':
                    result = Integer.parseInt(args[0])
                            * Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0])
                            / Integer.parseInt(args[2]);
            }

            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);


        } catch (Exception ex) {

            System.out.println("That is not a valid input, see error message below");
            System.out.println(ex);
        }
    }
}
