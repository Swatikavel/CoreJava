package string_immutable;

public class ContentEquals {
    static void main() {
        String str  = "Java";
        String s = "Java";
        System.out.println(str.contentEquals(s));
    }
}
//check whether the contents of a String are exactly equal to another CharSequence or StringBuffer.
