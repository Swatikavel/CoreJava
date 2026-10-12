package string_immutable;

public class CopyValueOf {
    static void main() {
        char arr [] = {'j','a','v','a'}; // Create a Char Arr.
        // convert char arr into String.
        String str = String.copyValueOf(arr);
        System.out.println(str);

    }
}
//It creates a String from a char[] array.