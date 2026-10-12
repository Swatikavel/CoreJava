package string_immutable;

public class HashCode {
    static void main() {
        String s ="Java";
        String s1 = "Java";
        String s2 = new String("Swati");

        System.out.println(s.equals(s1));
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
// we check the content of String object , they have same hash code.
// Returns the integer hash value for a String.
// If content different they have different hashcode.