package com.java.PatternProgram;
import java.util.Scanner;

public class reversenumpyramid {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter num of Rows");
        sc.nextInt();
        for (int i=1; i<=5;i++){
            for (int j=5; j>=i;j--){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
