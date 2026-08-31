package com.java.PatternProgram;
import java.util.Scanner;
public class hashpyramid {
   public static void main(String[] args) {
        int n,j,i;
        Scanner sc = new Scanner(System.in);
       System.out.println(" Enter num of Rows");
       sc.nextInt();
       for (i=0;i<=5;i++){
           for (j=0; j<=i;j++){
               System.out.print("#"+ " ");
           }
           System.out.println();
       }
    }

}
