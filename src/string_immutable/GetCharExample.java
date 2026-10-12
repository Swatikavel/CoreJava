package string_immutable;

public class GetCharExample {
    static void main() {
        String s ="Hello Java";
        char[]arr=new char[4];
        s.getChars(6,10,arr,0);
        System.out.println(arr);
    }
}
//getChars() is a String method used to copy a specific range of characters from a String into a char[] array.