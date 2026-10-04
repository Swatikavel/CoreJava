package string_immutable;

public class RemoveMethods {
    static void main() {
     String word= "   Java    Programming   ";
        System.out.println(word.trim());  //Remove leading and trailing spaces / Side space between "",not inside words space.
        System.out.println(word.replaceAll("\\s+", ""));
        //Remove all spaces Between words.
    }
}
//To remove white spaces from a string, use the ‘.trim()’ method. It removes leading and trailing whitespaces, not all whitespaces inside the string.
//If you want to remove all white spaces (including those inside the string), you should use .replaceAll(“\\s+”, “”).