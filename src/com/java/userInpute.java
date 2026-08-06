package com.java;
import java.sql.SQLOutput;
import java.util.Scanner;
public class userInpute {
    public static void main (String[] args){
        Scanner jk = new Scanner(System.in);
        System.out.print("Enter your name: ");
         String name = jk.next();

        System.out.println("Enter your Roll no: ");
        int Rollno = jk.nextInt();

        System.out.println("Enter your marks: ");
        float marks = jk.nextFloat();

        System.out.println("Hello: "+name+", your rollno is "+Rollno+" and your marks are "+marks+"");
    }
}
