package inheritance;


class SingleParent{
    void SingleParentMethod(){
        System.out.println("Method of Parent Class");
    }
}

public class single_Inheritance extends SingleParent {
    public static void main( String[]args){
        single_Inheritance obj = new single_Inheritance();
        obj.SingleParentMethod();
    }

}

