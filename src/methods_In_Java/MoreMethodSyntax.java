package methods_In_Java;

public class MoreMethodSyntax {

    // Syntax 3
    //returnType methodName(){
    // code will go here
    // }

    // whenever a method returns anything other than void,
    //writing return statement inside method is mandatory

    int returnInteger(){
        return 100;
    }
    void method() {
        System.out.println("This is simple method");
    }

    //syntax4

    //returnType methodName (datatype param1,datatype param2,...){
    //write logic here
    // }

    int addition (int a, int b){
        int c = a+b;
        return c;
    }








}
