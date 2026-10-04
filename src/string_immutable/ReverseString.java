package string_immutable;

public class ReverseString {
    static void main() {
        String original = "Java";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println(reversed);
    }
}
//To reverse a string in Java, use ‘StringBuilder’ or loops.
