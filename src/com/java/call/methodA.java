package com.java.call;

import com.Constructor.Main;

public class methodA {
    void show(){
        System.out.println("This is main method of method A");

    }
}
class methodB{
    void demo(){
        System.out.println(" This is main method of class method B");
        }

        public static void main (String[] args){
        methodA ab = new methodA();
        ab.show();
        methodB cd = new methodB();
        cd.demo();
        }

    }


