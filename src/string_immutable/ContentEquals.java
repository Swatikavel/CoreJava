package string_immutable;

public class ContentEquals {
    static void main() {
        String str  = "Java";
        StringBuffer sb = new StringBuffer("Java");
        System.out.println(str.contentEquals(sb));
    }
}
//check whether the contents of a String are exactly equal to another CharSequence or StringBuffer.
