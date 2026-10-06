package string_immutable;

public class CompareTo {
    public static void main (String[] args){
        String  a ="Java";
        String b = "Python";
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        //It returns a negative value because "Apple" comes before "Banana" lexicographically.
    }
}
