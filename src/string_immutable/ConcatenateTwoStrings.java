package string_immutable;

public class ConcatenateTwoStrings {
    static void main() {
        String FirstWord = "Morning";
        String SecondWord = "Night";
        String result = FirstWord + SecondWord;
        System.out.println(result);
        String result1 = FirstWord.concat(SecondWord);
        System.out.println(result1);
    }
}
