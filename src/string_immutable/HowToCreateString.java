package string_immutable;

public class HowToCreateString {
    public static void main (String[] args){
        String s = "Practice"; // Using literal String object Store in String constant Pool(SCP) memory
        String sr1 = new String("Practice"); // using new keyword object store in Heap memory
        System.out.println(s);
        System.out.println(sr1);
        System.out.println(s.equals(sr1));
    }
}
//Whenever create the String literal object they check first object is presence in SCP or not if present there they share copy for heap object not create duplicate object
// whenever using new keyword and create object it create always a new object on heap memory
