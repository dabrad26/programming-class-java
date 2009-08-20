package bradshawlab1;

//David Bradshaw    8.19 Write/Read Data
//import java.util.Arrays;
import javax.swing.JOptionPane;
//import java.util.Scanner;
//import java.lang.String;
public class WriteRead {

    public static void main(String[] args) throws Exception {

        java.io.File file = new java.io.File("Excercise8_19.txt");

        if(file.exists()) {

        JOptionPane.showMessageDialog(null, "That file exists! \n Can Not Overwrite");
        System.exit(0);
        }

        java.io.PrintWriter output = new java.io.PrintWriter(file);

        for (int i = 0; i < 100; i++){
        output.print((int)(Math.random() * 100) + " ");

        }

        output.close();

    }
}