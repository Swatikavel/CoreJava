package string_immutable;

public class CodePointBefore {
    static void main() {
        String s = "System";
        System.out.println(s.codePointBefore(6));
    }
}
//return the before char Unicode which we point out.