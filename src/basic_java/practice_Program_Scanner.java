package basic_java;

import java.util.Scanner;

public class practice_Program_Scanner {
    public static void main(String[]args) {
        // Create a scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        // prompt the user to input the first number
        System.out.println("input first number");
        // read and store the first number
        int num1 =in.nextInt();
        // prompt the user to input the second number
        System.out.println("input Second number");
        // read and store the second number

        // calculate and print the sum of the two number
        System.out.println(num1 + " + " + 24 + " = " + (num1 + 24));

        //calculate and print the difference of the two number
        System.out.println(num1 + " - " + 24 + " = " + (num1 - 24));

        //calculate and print the Product of the two number
        System.out.println(num1 + " * " + 24 + " = " + (num1 * 24));

         //calculate and print the Division of the two number
        System.out.println(num1 + " / " + 24 + " = " + (num1 / 24));

        //calculate and print the Reminder of the two number
        System.out.println(num1 + " % " + 24 + " = " + (num1 % 24));




    }
    }

