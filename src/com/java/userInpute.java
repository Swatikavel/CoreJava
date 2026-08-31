package com.java;
import java.util.Scanner;
public class userInpute {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
         String name = sc.nextLine();
        System.out.println("Enter your Roll no: ");
        int Rollno = sc.nextInt();
        System.out.println("Enter your marks: ");
        float marks = sc.nextFloat();

        System.out.println("Hello: "+ name +", your rollno is "+ Rollno +" and your marks are "+ marks +"");
        sc.close();
    }
}
