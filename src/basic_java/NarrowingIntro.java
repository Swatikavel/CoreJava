package basic_java;

public class NarrowingIntro {
    public static void main (String[] args){
        int num = 500;
         Byte result = (byte) num; // narrowing
         //narrowing->Big--->Small

        System.out.println("Integer value:" +num);
        System.out.println("Byte value:" +result);

    }
}
