package bradshawlab1;
        import javax.swing.JOptionPane;
public class RockPaperScissors {

    public static void main(String[] args) {
    // Retrieve User Input
    String user = JOptionPane.showInputDialog("Enter a number,0 through 2: \n 0 for Rock \n 1 for Paper \n 2 for Scissors");
    int user1 = Integer.parseInt(user);
    //Create challenge number --random

    int computer = (int)(Math.random() * 3);

    //If true
    if ((user1 > 2) || (user1 < 0)) {
        String output = "That is not a valid choice, \n remember 0 to 2";

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);
    }

    else if ( user1 == computer) {
        String output = "Tie, try again!";

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);;
    }

    else if ((((user1 == 1) && (computer == 0))) || (((user1 == 0) && (computer == 2))) || (((user1 == 2) && (computer == 1)))) {
        String output = "Yay, you win! You chose " + user1 + " , and computer chose " + computer;

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);;
    }

    else if ((((user1 == 0) && (computer == 1))) || (((user1 == 2) && (computer == 0))) || (((user1 == 1) && (computer == 2)))) {
    String output = "Sorry, you lose! You chose " + user1 + " , and computer chose " + computer;

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);;
  }
    }
}