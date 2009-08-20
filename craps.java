package bradshawlab1;

//import java.util.Arrays;
//import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
//import java.util.Scanner;
public class craps {

    public static void main(String[] args) {

        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;

        int total = dice1 + dice2;
        if ((total == 2) || (total == 3) || (total == 12)) {

            System.out.println("You lose! You rolled a " + total);
        } else if ((total == 7) || (total == 11)) {

            System.out.println("You Win! you rolled a " + total);
        } else {

            roundTwo(total);
        }


    }

    public static void roundTwo(int total) {

        System.out.println("You earned a point, you get to roll again, you rolled: " + total);

        while (true) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;

            int gameTwoTotal = dice1 + dice2;


            if (gameTwoTotal == 7) {

                System.out.println("You lose! You rolled a " + gameTwoTotal);
                break;
            } else if (total == gameTwoTotal) {

                System.out.println("You Win! you rolled a " + gameTwoTotal);
                break;
            } else {
                System.out.println("You roled a: " + gameTwoTotal + " roll again");
            }


        }
    }
}
