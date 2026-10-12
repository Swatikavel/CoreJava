package string_immutable;

public class StringBuilderExample {
    static void main() {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming13rgawds");
       // sb.insert(0,"Learn");
       // sb.delete(1,3);
        sb.replace(0,5,"Hama");
        sb.reverse();
        System.out.println(sb.length());
        System.out.println(sb.capacity());

    }
}
//StringBuilder is used when you need to perform many string modifications, especially in single-threaded applications.