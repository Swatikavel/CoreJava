package polymorphism;

 class Demo {
    static void show(){
        System.out.println("Parent");
    }
}
class Child extends Demo{
    static void show(){
        System.out.println("Child");
    }
        }
       public class MethodHiding {
    public static void main (String[] args){
        Demo m = new Child();
        m.show();
    }
        }
