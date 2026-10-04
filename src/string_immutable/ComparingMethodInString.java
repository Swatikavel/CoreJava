package string_immutable;

public class ComparingMethodInString {
    static void main() {
        String s ="Swati";
        String s1 = "Swati";
        String s2 = new String("Swati");
        System.out.println(s==s1);  // == Operator check the memory addresses
        System.out.println(s1.equals(s2)); // Equals() check the content of object
        System.out.println(s1==s2); // String literal object store in SCP and new keyword object store in Heap this condition is False.
    }
}
