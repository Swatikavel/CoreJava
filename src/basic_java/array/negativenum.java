package basic_java.array;

import java.lang.reflect.Array;

public class negativenum {
    // Ex#6: Write program where we pass negative number as size to array
    public static void main(String[] args) {
        int size = -5;
        System.out.println("Attempting to create an Array with size:" + size);
        try {
            // Trying to allocate  an array with a negative size
            int[] myArray = new int[size];
            // This line will never execute because an exception is thrown above
            myArray[0] = 10;
        } catch (NegativeArraySizeException e) {
            // Catching the specific exception thrown by Java
            System.out.println("Error caught: " + e);
        }
    }
}