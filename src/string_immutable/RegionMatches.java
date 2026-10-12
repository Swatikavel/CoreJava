package string_immutable;

public class RegionMatches {
    static void main() {
        String s = "Hello java";
        String s1 =  "jaVa Programming";
        boolean result = s.regionMatches(true,6, s1, 0,4);
        System.out.println(result);
    }
}
//checks whether a part of one String is equal to a part of another String.
//ignoreCase =true = ignore uppercase/lowercase
//toffset = Starting index in first String
//str2 =Second String
//ooffset =Starting index in second String.
//len = Number of characters to compare