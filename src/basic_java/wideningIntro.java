package basic_java;

public class wideningIntro {
    public static void main (String[] args){
           byte b = 120;
           short result = b;
        // widening->Small--->Big

        System.out.println("Byte value:" +b);
        System.out.println("Short value:" +result);
    }
}
