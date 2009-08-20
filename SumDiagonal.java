package bradshawlab1;

//David Bradshaw    6.21
//import java.util.Arrays;
//import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
//import java.util.Scanner;
public class SumDiagonal{

    public static void main(String[] args) {

        int[][] test = {{1,2,4,5}, {6,7,8,9}, {10,11,12,13}, {14,15,16,17}};

        int answer = SumDiagonal(test);

        System.out.println("The Sum is: " + answer);

    }

    public static int SumDiagonal(int[][] test) {

    int i = 0;
    int answer = 0;

    while(i < test.length){

        answer += test[i][i];

        i++;
    }

    return answer;

    }
}
