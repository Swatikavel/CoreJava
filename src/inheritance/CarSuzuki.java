package inheritance;

class Brand {
    void BrandMethod(){
        System.out.println("Method of Brand Class");

    }
}
public class CarSuzuki extends Brand {      // Parent class
    public static void main (String[]args){
        CarSuzuki obj = new CarSuzuki();
        obj.BrandMethod();
    }

}
