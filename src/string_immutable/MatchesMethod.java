package string_immutable;

public class MatchesMethod {
    static void main() {
        String l = "Swati";
        System.out.println(l.matches ("[A-Za-z]+"));
    }
}
//used to check whether a String matches a given regular expression (regex).
//It returns a boolean:
//- true → String matches the regex
//- false → String does not match
