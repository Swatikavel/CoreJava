package string_immutable;

public class StringFormat {
    static void main() {
        String name = "Swati";
        int age = 22;

        String result = String.format("My name is %s and I am %d years old. ", name , age);
        System.out.println(result);
    }
}
//String.format() is a static method used to create a formatted String by inserting values into a format pattern.
// %s = String,
//%d = Integer,
//%c = character,