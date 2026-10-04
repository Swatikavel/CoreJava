package string_immutable;

public class SplitString {
    static void main() {
        String name = "Apple , Banana, CusturdApple";
        String[] Fruits = name.split(",");
        for (String Fruit : Fruits) {
            System.out.println(Fruit);
        }
    }
}
