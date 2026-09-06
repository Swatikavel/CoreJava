package inheritance;


class SingleParent{
    void SingleParentMethod(){
        System.out.println("Method of Parent Class");
    }
}

public class Single_Inheritance extends SingleParent {
    public static void main( String[]args){
        Single_Inheritance obj = new Single_Inheritance();
        obj.SingleParentMethod();
    }

}

