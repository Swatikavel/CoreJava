package string_immutable;

public class StringBuffer {
    static void main() {
        java.lang.StringBuffer sb = new java.lang.StringBuffer(" Swati");
        sb.append(" Kavel");
        // sb.insert(0,"Learn");
        // sb.delete(1,3);
        //sb.replace(0,5,"Hama");
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
