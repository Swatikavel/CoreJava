package string_immutable;

final class CustomImmutable {
    private final int age;
    private final String name;

    public CustomImmutable(int age , String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
     public class Immutable {
       public  static void main(String[] args) {
             CustomImmutable ci = new CustomImmutable(22,"Swati");
             System.out.println(ci.getAge());
             System.out.println(ci.getName());

         }
     }


// Yes we can create Custom Immutable Class .
// Class declare as Final.
//Variable fields declare private or final .
// create constructor to initialize value.
//avoid the setter method.

