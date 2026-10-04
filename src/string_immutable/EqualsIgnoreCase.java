package string_immutable;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String a = "java";
        String b = "JAVA";
        System.out.println(a.equalsIgnoreCase(b));

        String name = "Java Programming"; // Contains() Method
        System.out.println(name.contains("Java"));
        System.out.println(name.contains("Python"));

        //String s = "Swati Kavel"; // endWith() Method
        //System.out.println(s.endsWith("Kavel"));

        String s = "  Java   Programming "; // It does not remove spaces between the words.
       // System.out.println(s.trim());
        System.out.println(s.replaceAll("\\s", ""));
        // Remove all Spaces Between the words.

        String data = "Java,Python,C++";
        String [] languages = data.split(",");
        for (String language : languages){
            System.out.println(language);

            String n = "Samer";
            System.out.println(name.indexOf('a'));
        }

    }
}