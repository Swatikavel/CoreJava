package wayscreateobject;
class Doctor{
    String name;
    private Doctor (String name){
        this.name=name;
    }
    // Factory Method
    public static Doctor createDoctor(String name){
        return new Doctor(name);
    }
}
public class FactoryMethod {
    static void main() {
Doctor D = Doctor.createDoctor("Swati");
        System.out.println(D.name);
    }
}
