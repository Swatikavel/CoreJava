package basic_java;

public class Call_Method {
    void hello() {
        System.out.println("hello");
    }

    void show() {
        String name = "Ram";
        System.out.println("String name Ram");
    }
    public static void main(String[]args){
        Call_Method obj = new Call_Method();
        obj.hello();
        obj.show();
    }
}


// Write Program with one user defined method calling another user
 // defined method