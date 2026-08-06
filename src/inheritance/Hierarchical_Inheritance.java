package inheritance;

public class Hierarchical_Inheritance {
    class Parent {
        Parent() {
            int a= 10;
            System.out.println("Method of Parent class");
        }
    }

    class Child {
        Child() {
            System.out.println("Method of Child class");

        }
    }

    class Child1 {
        Child1() {
            System.out.println("Method of Child1 class");
        }
    }

    class Child2 {
        Child2() {
            System.out.println("Method of Child2 class");
        }
    }

    static class Child3 {
        Child3() {
            System.out.println("Method of Child3 class");
        }
    }

     public static void main(String[] args) {
            Child3 obj = new Child3();


        }
    }
