package String_Immutable;

import java.util.Comparator;
import java.util.List;

public class FindLongestString {
    public static void main(String[] args){
        List<String> words = List.of(
                "Java", "Spring", "Kubernates",
                "AI", "Microservices",
                "Docker", "API"
        );
        String longest = words.stream()
                .max(Comparator.comparing(String::length))
                .orElse("");
        System.out.println(longest);
    }
}
//"stream() converts the list into a stream, Comparator.comparing(String::length) compares Strings based on their length, max() finds the String with the maximum length, and orElse() provides a default value if the list is empty."