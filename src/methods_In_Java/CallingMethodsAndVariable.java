package methods_In_Java;

public class CallingMethodsAndVariable {
    int age = 100;
    double salary = 100000;

    void method1(){
        System.out.println("This method does not take any param");

    }
    void method2(int a,int b){
        System.out.println("This method takes 2 parameters");
    }
    public static void main(String [] args){
    //
        System.out.println("This is Starting point from where execution begins");

        CallingMethodsAndVariable obj = new CallingMethodsAndVariable();
        // syntax for accessing variables
        // objectreference.variableName;
        System.out.println(obj.age); //50
        System.out.println(obj.salary); //100000



    }
}

