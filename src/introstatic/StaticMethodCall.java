package introstatic;

public class StaticMethodCall {  // Create class
    static char c = 'a'; // Static Variable
    static void show(){  //static method
        System.out.println("Static Method");
    }
    public static void main (String[] args){ // Main method
        show(); // static method call
        System.out.println(c); // static variable call
    }
}
