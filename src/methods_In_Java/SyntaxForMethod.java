package methods_In_Java;

public class SyntaxForMethod {
    //

    //void => empty space or returns nothing

    //syntax1
    //returnType methodName(){
    // code will go here
    // }

    void method1() {
        System.out.println("This is simple method");
    }

    void abcd() {
        System.out.println("abcd method");
    }

    //syntax2
    //returnType methodName (datatype param1,datatype param2,...){
    //write logic here
    // }

    void addition(int a, int b) {
        int result = a + b;
        System.out.println("addition of 2 numbers is " + result);
    }
}