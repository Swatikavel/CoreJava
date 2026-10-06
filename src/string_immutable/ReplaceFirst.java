package string_immutable;

public class ReplaceFirst {
    static void main() {
        String s ="Java";
        System.out.println(s.replaceFirst("Java","Python"));
    }
}
//used to replace only the first part of a String that matches a given regular expression (regex).
//It returns a new String. The original String is not changed because Strings are immutable.