package string_immutable;

public class PalindromeString {
    public static boolean isPalindrome(String text){
        // Remove non-alphanumeric characters and convert to lowercase
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    // Compare characters from both ends
    int left = 0;
    int right = clean.length() - 1;
        while (left < right) {
        if (clean.charAt(left) != clean.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
        return true;
}
public static void main(String[]args) {
        String text = "A man, a plan, a canal: Panama";
        if(isPalindrome(text)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}