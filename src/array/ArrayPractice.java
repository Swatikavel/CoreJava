package array;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int arr1[] = {10, 20, 30, 30, 40, 50};
        //for(int i =arr.length-1; i>=0; i--){
//        for(int i:arr1)
//            System.out.println(i);
//        }
        //    System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(arr1[i]);
            }
            System.out.println("*************************************");
        }
    }
}


