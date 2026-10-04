package basic_java;

public class HelloWorldPrint {
   static void main(String[] args) {
       String name = "Swati";
       System.out.println("My name is - " +name);
       System.out.println("Hello World");
       HelloWorldPrint hwp = new HelloWorldPrint();
       hwp.add();
    }
    void add() {
        int a = 20;
        int b = 30;
        int sum = a + b;
        System.out.println((a+b));
    }
        }

