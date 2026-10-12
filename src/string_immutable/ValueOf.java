package string_immutable;

public class ValueOf {
    static void main() {
        int number =100;
        boolean status= true;
        double price = 99.00;
        //converts values into String
        String s1 = String.valueOf(number);
        String s2 = String.valueOf(status);
        String s3 = String.valueOf(price);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
//It converts a value into its String representation.
//It can convert primitive values such as int, long, float, double, char, boolean, and also objects into a String.