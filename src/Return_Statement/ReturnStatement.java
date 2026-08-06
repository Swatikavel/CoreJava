package Return_Statement;

public class ReturnStatement {
    // Declare instance variable of type int and assign it with value 100. The value 100 goes into variable named x.
    int x=100;
    // Declare a method with no parameter.
    int M1() {
        System.out.println("M1 Method");
                return x;  // return instance variable
    }
    public static void main (String[] args){
        ReturnStatement obj = new ReturnStatement();
        // call m1() method and store returning integer value using a variable name 'a'.
         int a = obj.M1();
         System.out.println("Method return value =" +a);
    }
}
// Return statement always used at the end of the method.
// Return statement can send only one variable from method to its caller function.
// eg = int c= a+b;
//      int p=a*b;
//       return only one variable c either p , we can  return only once time in one method.
