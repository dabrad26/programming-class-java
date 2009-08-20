package bradshawlab1;

//David Bradshaw    Lab 6.5


//import java.util.Arrays;
//import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
//import java.util.Scanner;
public class ArrayTenDigits {

    public static void main(String[] args) {

        int[] array = new int[10];
        System.out.print("The Array is:");

        for (int i = 0; i < 10; i++) {

            String numbers = JOptionPane.showInputDialog("Enter number: ");
            array[i] = Integer.parseInt(numbers);

            boolean isDuplicate = checkSame(array, array[i], i);

            if (!isDuplicate) {
                System.out.print(" " + array[i] + " ");
            }
            
            

        }

        
        System.out.println("");
    }

    public static boolean checkSame(int[] array, int test, int place) {

        for (int i = 0; i < array.length; i++) {
            if ((array[i] == test) && (i != place)) {
                return true;
            }
        }
        
        return false;
    }
}
