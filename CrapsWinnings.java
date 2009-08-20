package bradshawlab1;

//import java.util.Arrays;
//import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
//import java.util.Scanner;
public class CrapsWinnings {

    public static void main(String[] args) {

        int winnings = 0;

        for (int j = 1; j <= 10000; j++) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;

            int total = dice1 + dice2;
            if ((total == 2) || (total == 3) || (total == 12)) {

            } else if ((total == 7) || (total == 11)) {

                winnings = (winnings + 1);
            } else {

                winnings = roundTwo(total, winnings);
            }
        }

        System.out.println("You won a total of: " + winnings);

    }

    public static int roundTwo(int total, int winnings) {



        while (true) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;

            int gameTwoTotal = dice1 + dice2;


            if (gameTwoTotal == 7) {

            } else if (total == gameTwoTotal) {


                winnings = (winnings + 1);
                return winnings;

            } else {

            }



        }
    }
}
