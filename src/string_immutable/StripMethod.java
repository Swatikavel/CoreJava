package string_immutable;

public class StripMethod {
    static void main() {
        String s = "       Hello Java  ";
        System.out.println(s.strip());

        String a = "          Java Language    ";
        System.out.println(a.stripLeading()); //Removes whitespace only from the beginning (left side).

        String t = "         Java  Pro             ";
        System.out.println(t.stripTrailing());//Removes whitespace only from the end (right side).
    }
}
//Removes whitespace from both beginning and end of a String.