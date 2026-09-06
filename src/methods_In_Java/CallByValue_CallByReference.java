package methods_In_Java;

public class CallByValue_CallByReference {
    int x=20;
    static void modify(int x) {
        x=x + 200;
        System.out.println("Value of X after modification: "+x);
    }
    public static void main (String[] args){
        CallByValue_CallByReference obj = new CallByValue_CallByReference();
        modify(obj.x);
        System.out.println("Original value of x:"+obj.x);

    }

}
