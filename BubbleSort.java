package bradshawlab1;

//David Bradshaw    6.18
//import java.util.Arrays;
//import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
//import java.util.Scanner;
public class BubbleSort {

    public static void main(String[] args) {

        double[] test = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5, 9.9, 8.9, 5.4, 3,4};

        bubble(test);

        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
        System.out.println("");

    }

    public static void bubble(double[] test) {


        int k = -1;

        double temp;

        while (k < test.length) {

            for (int i = 0; i < (test.length - 1); i++) {



                if (test[i] > test[(i + 1)]) {

                    temp = test[i];
                    test[i] = test[(i + 1)];
                    test[(i + 1)] = temp;


                }


            }
            k++;

        }
    }
}
