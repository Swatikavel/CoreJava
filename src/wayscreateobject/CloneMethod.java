package wayscreateobject;


class Student implements Cloneable{
    String s ="Java";
    public Student clone()throws CloneNotSupportedException{
        return (Student)super.clone();
    }
}
public class CloneMethod {
    static void main() throws CloneNotSupportedException {
        Student s1 = new Student();
        // Create a copy of the existing object.
        Student s2 = s1.clone();
        System.out.println(s2.s);
        System.out.println(s1.equals(s2));
        System.out.println(s2==s1);
    }
}