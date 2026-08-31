package com.java.PatternProgram;
import java.util.Scanner;

public class downtoupPyramid {
    public static void main(String[] args) {
        int n,j,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows");
        sc.nextInt();
        for (i=5; i>=0;i--){
            for (j=1; j<=i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }

}
