package com.java.PatternProgram;
import java.util.Scanner;
public class Reversepyramid {
    public static void main (String[] args){
        int n,i,j;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no of rows");
        sc.nextInt();
        for (i=5; i>=1; i--){
            for (j=1; j<=i;j++){
                System.out.print("#"+ " ");
            }
            System.out.println();
        }
    }

}
