package bradshawlab1;

//David Bradshaw    6.5 Distinct Numbers
//import java.util.Arrays;
//import javax.swing.JOptionPane;
import java.util.Scanner;
//import java.lang.String;
public class DistinctNumbers {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++){
            
            System.out.print("Enter a number: ");   
            numbers[i] = input.nextInt();
            
            for(int j = 0; j < 10; j++){
            
            if(numbers[i]-1 == numbers[j]){
                numbers[i] = 0;
            }
            
            }
        }
        
        System.out.print("The Distinct Numbers are: ");
        
        for(int i = 0; i < 10; i++){

            if(numbers[i] != 0){
            System.out.print(numbers[i] + " ");
            }
        }
    }
}