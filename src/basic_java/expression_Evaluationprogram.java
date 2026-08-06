package basic_java;

// define a constant for the radius of the circle
   //  private static final double radius = 7.5;
// Write a Java program to print the area and perimeter of a circle.
//Test Data:
//Radius = 7.5
import java.util.Scanner;
public class expression_Evaluationprogram {
    public static void main (String[]args){
       // create a scanner object to read input from the user
        Scanner io = new Scanner (System.in);

        // prompt the user to input the radius of the circle
        System.out.println("input the radius of the circle");
        // read and store the input radius
        double radius =io.nextDouble();
        // calculate and print the perimeter of the circle
        System.out.println("Perimeter is ="+(2*radius*Math.PI));
        // calculate and print the area of the circle
        System.out.println("Area is ="+(Math.PI*radius*radius));




    }
}
