package basic_java;

public class Staticclass { //class
    String name;
  //  int a=20;
     static void show(){ // static method
        // System.out.println(a);
        System.out.println("This is Static method");
    }
    public static void main (String[] args) {
        show(); // we can call static method without create object and without class reference
    }
}


