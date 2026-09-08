package introstatic;

public class StaticBlockCall {  // Create Class
    static {
        System.out.println("Static Block");  // Static Block
    }
    public static void main (String[] args){  // Main Method
        System.out.println("Main Method");
    }
}
// Static Block Execute automatically when the class is loaded by the JVM before main method.