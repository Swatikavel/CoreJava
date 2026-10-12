package string_immutable;

public class FindOut {
    static void main() {
        String str = "abc %  $ java PROGRAMMING 123 # @";

String result = str.replaceAll("[^a-zA-Z0-9 ]","");
       // System.out.println(str.replaceAll("[^a -zA -Z0 -9]",""));
        System.out.println(result);
    }
}
