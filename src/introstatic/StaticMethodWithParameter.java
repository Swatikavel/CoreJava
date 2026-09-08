package introstatic;

public class StaticMethodWithParameter { // Create Class
    static int a; //Declare static variable
    static String name; // Declare static variable
    static void show(int a,String name){ // Static Method with parameter
        System.out.println(a); // Print Statement
        System.out.println(name);  // Print Statement
    }
    public static void main (String[] args){
        show(20,"Dell"); // call static method with parameter passes
    }
}
