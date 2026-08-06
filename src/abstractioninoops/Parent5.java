package abstractioninoops;

//If concrete or non-abstract class extends  abstract class,
//then its  mandatory for that child class to provide method implementations of
//abstract methods of super class.

abstract class parent {
          abstract void m1();
}

public class Parent5 extends parent{
    void m1(){
        System.out.println("it is must an parent class is abstract and child is concrete");
    }

}
