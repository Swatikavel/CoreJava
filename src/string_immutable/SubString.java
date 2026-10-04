package string_immutable;

public class SubString {
    static void main() {
        String Sentence = " Java Programming";
        String substring = Sentence.substring(0,11);
        System.out.println(substring);
    }
}
//the .substring(startIndex, endIndex) method. The startIndex is inclusive, and the endIndex is exclusive.
// Space also counted.