package String_Immutable;

public class Strings_Immutable {
    public static void main(String[] args){

        String immutableString = "Hello";
        // String Pool

        String S2 = immutableString.concat("word");
        // Heap Memory

        String S3 = immutableString.concat("word").intern();
        // String Pool

        String S4 = new String("Hello World");
        // Heap Memory

        String S5 = "Hello World";

        String S6 =S5.concat("My");

        System.out.println(S6);


    }
}
