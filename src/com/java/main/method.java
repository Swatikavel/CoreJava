package com.java.main;
// In single Java File write main method in all classes.
public class method {
    public static void main(String[] args) {
            int a = 100;
            System.out.println("This is the main method of method");

    }

}
class functions{
        public static void main (String[] args){
            String name = "Ram";
            System.out.println("This is main method of functions");
        }
    }

    class Features{
    public static void main (String[] args) {
        int num = 124;
        System.out.println(" This is main method of Features");

        functions oj = new functions();
        method lj= new method();
        Features kj= new Features();
    }
    }

