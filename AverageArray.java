package bradshawlab1;

//import java.util.Arrays;
//import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
//import java.util.Scanner;
public class AverageArray {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};
        double[] array2 = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};


        System.out.println("" + average(array1));
        System.out.println("" + average(array2));
    }


    public static int average(int[] array1) {


        int i;
        int total = 0;
    for(i = 0; i < array1.length; i++){

        total += (array1[i]);
    }
    int average = (total/i);

    return average;



        }

        public static double average(double[] array1) {


        int i;
        double total = 0;
    for(i = 0; i < array1.length; i++){

        total += (array1[i]);
    }
    double average = (total/i);

    return average;
        }
    }
