package string_immutable;

public class GetByte {
    static void main() {
        String s ="Java";
        byte []bytes =s.getBytes();
       for(byte b: bytes){
            System.out.println(b);
        }
       String b = new String(bytes); // return byte into the String
        System.out.println(b);
    }
}
//getBytes() is a String method used to convert a String into a byte array (byte[]).
// return ASCII value
// Important : getBytes()Return byte[], not String.