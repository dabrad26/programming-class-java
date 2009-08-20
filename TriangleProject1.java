package bradshawlab;
//David Bradshaw Excercise 10.1
public class TriangleProject {

   public static void main(String[] args) {

       TriangleClass Triangle = new TriangleClass(1, 1.5, 1);

       System.out.println(Triangle.toString());
       System.out.println("The Perimeter is: " + Triangle.getPerimeter());
       System.out.println("The Area is: " + Triangle.getArea());

}
}
//Main program hidden
//Original File Called GeometricObject.java

package bradshawlab;

public class GeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  //Construct a default geometric object
  public GeometricObject() {
    dateCreated = new java.util.Date();
  }
  public String getColor() {
    return color;
  }
}
//Original File called TriangleClass.java
//File cut to smaller size, no longer runnable
package bradshawlab;

public class TriangleClass extends GeometricObject {

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public TriangleClass(double side1, double side2, double side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }