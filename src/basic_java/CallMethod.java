package basic_java;

public class CallMethod {
    void hello() {
        System.out.println("hello");
    }

    void show() {
        String name = "Ram";
        System.out.println("String name Ram");
    }
    public static void main(String[]args){
        CallMethod obj = new CallMethod();
        obj.hello();
        obj.show();
    }
}


// Write Program with one user defined method calling another user
 // defined method