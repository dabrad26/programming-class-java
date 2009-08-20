package bradshawlab1;
        import javax.swing.JOptionPane;
public class TrianglePerimeter {

    public static void main(String[] args) {
    // Retrieve User Input
    String side1 = JOptionPane.showInputDialog("Enter an Integer:");
    int tside1 = Integer.parseInt(side1);

    String side2 = JOptionPane.showInputDialog("Enter an Integer:");
    int tside2 = Integer.parseInt(side2);

    String side3 = JOptionPane.showInputDialog("Enter an Integer:");
    int tside3 = Integer.parseInt(side3);
    //Compute whether it is true or not

    //If true
    if ((tside1 + tside2 > tside3) && (tside2 + tside3 > tside1) && (tside1 + tside3 > tside2)) {
        String output = "Your Perimeter is " + (tside1 + tside2 + tside3);
        output = output + "\nThank you for Using!";

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);


    }
    else {
        String output = "That is not a real triangle, try again!";

    JOptionPane.showMessageDialog(null, output);
    System.out.println(output);;
    }
  }
}