package com.java;

public class sumofarray {
    static void main() {
    int []num={30,50,70,22};
    int sum =0;
    for (int i=0; i< num.length;i++){
        sum = sum +num[i];
        System.out.println("Sum of value of array elements:" +sum);
    }
    }
}
