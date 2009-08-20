package bradshawlab;

//David Bradshaw Excercise 18.5

public class TriangleException {

   public static void main(String[] args) {

       double side1 = 1;
       double side2 = 1.5;
       double side3 = 1;

       if ((side1 + side2 < side3) || (side2 + side3 < side1) || (side1 + side3 < side2)){

           System.out.println("This is not a valid Triangle!");

           }

       else{
       TriangleClass Triangle = new TriangleClass(side1, side2, side3);
       System.out.println(Triangle.toString());
       System.out.println("The Perimeter is: " + Triangle.getPerimeter());
       System.out.println("The Area is: " + Triangle.getArea());

       }
   }
   

}


   
