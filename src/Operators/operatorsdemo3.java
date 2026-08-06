package Operators;

public class operatorsdemo3 {
    public static void main (String[] args) {
        String s="Tdit";
        int b =10;
        int c= 20;
        int d= 30;
        System.out.println(s+b+c);              //Tdit1020
        System.out.println(b+c+s);             //30Tdit
        System.out.println(b+s+c+d);       //10Tdit2030
    }
}
