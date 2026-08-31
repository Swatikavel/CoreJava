package com.java.PatternProgram;
import java.util.Scanner;
 public class numpyramid {
    public static void main(String[]args){
        int n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows");
        sc.nextInt();
        for (i=2; i<=5; i++){
            for (j=2; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }

    }
}
