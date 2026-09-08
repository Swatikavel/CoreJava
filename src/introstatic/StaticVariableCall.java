package introstatic;

public class StaticVariableCall {  // Create Class
//    static int a = 10;  // Static Variable
//    public static void main (String[] args) { // Main Method
//        int b = 20;  // Local Variable
//        show();   //Declare method
//        }
//    static void show () {   // Method with statement
//        System.out.println(a);
//    }
//}
    static String name = "Ram";
    int a =43;
    public static void main (String[] args){
        System.out.println(name); // call static variable
    }
}