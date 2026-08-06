package methods_In_Java;

public class callbyvalue_callbyreference {
    int x=20;
    static void modify(int x) {
        x=x + 200;
        System.out.println("Value of X after modification: "+x);
    }
    public static void main (String[] args){
        callbyvalue_callbyreference obj = new callbyvalue_callbyreference();
        modify(obj.x);
        System.out.println("Original value of x:"+obj.x);

    }

}
