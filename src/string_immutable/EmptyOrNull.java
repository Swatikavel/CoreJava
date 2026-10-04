package string_immutable;

public class EmptyOrNull {
    static void main() {
        String text1="";
        String text2="num";
        System.out.println((text1));
        System.out.println((text2));
        System.out.println(("Hello"));
        System.out.println(isNullOrEmpty(null));
    }
    static boolean isNullOrEmpty(String str){
        return str == null || str.isEmpty();
    }
}
//To check if a string is either null or empty (“”), you should first check if it is not null, then check if it’s empty using .isEmpty().