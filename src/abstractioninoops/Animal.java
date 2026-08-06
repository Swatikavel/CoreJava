package abstractioninoops;

import java.sql.SQLOutput;

//If one abstract class extends another abstract class,
//then it's not mandatory for that child class to provide method implementations of
//abstract methods of super class.

 abstract class Animal {
     abstract void m1();
 }
abstract class name extends Animal{
     void m1(){
         System.out.println("provide implemention");
     }
}
