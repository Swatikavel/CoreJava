package string_immutable;

public class InternMethod {
    static void main() {
        String s ="Java";
        String s1 = new String("Java");
        String s3 = s1.intern();

        System.out.println(s==s1);
        System.out.println(s==s3);
    }
}
//It is mainly related to String Pool and memory sharing.
