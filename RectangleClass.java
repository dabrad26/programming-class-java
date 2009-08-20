package bradshawlab1;

//David Bradshaw    7.1 Rectangle Class
//import java.util.Arrays;
//import javax.swing.JOptionPane;
//import java.util.Scanner;
//import java.lang.String;

public class RectangleClass {

    public static void main(String[] args) {

    System.out.println("The First Rectangle information: ");
    
    Rectangle firstRectangle = new Rectangle(4.0, 40.0, "Red");
        System.out.println("The area is: " + firstRectangle.getArea());
        System.out.println("The Perimeter is: " + firstRectangle.getPerimeter());
        System.out.println("The color of the rectangle is: " + firstRectangle.color);

        System.out.println("\nThe Second Rectangle information: ");

    Rectangle secondRectangle = new Rectangle(3.5, 35.9, "Red");
        System.out.println("The area is: " + secondRectangle.getArea());
        System.out.println("The Perimeter is: " + secondRectangle.getPerimeter());
        System.out.println("The color of the rectangle is: " + secondRectangle.color);
    }
}

class Rectangle {

    double width;
    double height;
    String color;

    Rectangle() {
        width = 1;
        height = 1;
        color = "White";
       }

    Rectangle(double newWidth, double newHeight, String newColor) {

        width = newWidth;
        height = newHeight;
        color = newColor;

    }

    double getArea() {
        return (width * height);
    }

    double getPerimeter() {
        return (width + width + height + height);
    }
}