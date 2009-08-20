package bradshawlab1;
        import javax.swing.JOptionPane;
public class ISBN {

    public static void main(String[] args) {

    // Retrieve User Input

    String isbn1 = JOptionPane.showInputDialog("Enter first 9 numbers of ISBN");
    int isbn = Integer.parseInt(isbn1);

    //Compute individual numbers

    int d1 = (int)Math.floor(isbn / 100000000);
    int d2 = (int)Math.floor((isbn / 10000000) % 10);
    int d3 = (int)Math.floor((isbn / 1000000) % 10);
    int d4 = (int)Math.floor((isbn / 100000) % 10);
    int d5 = (int)Math.floor((isbn / 10000) % 10);
    int d6 = (int)Math.floor((isbn / 1000) % 10);
    int d7 = (int)Math.floor((isbn / 100) % 10);
    int d8 = (int)Math.floor((isbn / 10) % 10);
    int d9 = (int)Math.floor((isbn / 1) % 10);

    //Calculate ISBN with formula

    int isbnEnd = (((d1 * 1)+(d2 * 2)+(d3 * 3)+(d4 * 4)+(d5 * 5)+(d6 * 6)+(d7 * 7)+(d8 * 8)+(d9 * 9))%11);

    //Output to console

    //If checksum is 10 add X

    if (isbnEnd == 10) {

        String output = "Your ISBN number is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X";

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);
    }

    //Else add the checksum to the end

    else {

    String output = "Your ISBN number is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + (isbnEnd);

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);

    }
    }
}
