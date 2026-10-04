package polymorphism;

import java.awt.*;

class Dog{
    void sound(){
        System.out.println("Dog Bark");
    }
}
class Cat extends Dog{
    void sound(){
        System.out.println("Dag Bark Loudly");
    }
}
public class RuntimePolymorphism {
    public static void main (String[] args){
        Dog d = new Cat();
        d.sound();
    }
}
