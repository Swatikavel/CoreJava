package string_immutable;

public class CompareToIgnoreCase {
    static void main() {
        String s = "Java";
        String s1 = "JAVA";
        System.out.println(s.compareToIgnoreCase(s1));
    }
}
//String method used to compare two strings lexicographically (dictionary order) while ignoring uppercase and lowercase differences.