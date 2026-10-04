package string_immutable;

public class CompareTo {
    public static void main (String[] args){
        String a = "Apple";
        String b = "Banana";
        System.out.println(a.compareTo(b));
        //It returns a negative value because "Apple" comes before "Banana" lexicographically.
    }
}
