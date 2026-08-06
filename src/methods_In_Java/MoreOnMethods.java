package methods_In_Java;

public class MoreOnMethods {

    int age =100;

    public static void main(String []args){
        MoreOnMethods obj = new MoreOnMethods();
        System.out.println("age is" +obj.age);
        int res =obj.age + 100;

        System.out.println("after changing age "+res); // 200

    }

}
