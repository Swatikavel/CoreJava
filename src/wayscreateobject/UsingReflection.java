package wayscreateobject;

class Demo{
    void disply(){
        System.out.println("Object Created using Reflection");
    }
}
public class UsingReflection {
    static void main()throws Exception {
        Demo d = Demo.class.getDeclaredConstructor().newInstance();
        d.disply();
    }

}

