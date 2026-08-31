package basic_java;

class Birds {
    void sound() {
        System.out.println("Birds Sound");
    }
}

class Sparrow extends Birds {
    @Override
    void sound() {
        System.out.println("Sparrow Sound");
    }

    void Food() {
        System.out.println("Sparrow Food");
    }
}
class crow{
    void color(){
        System.out.println("crow color is black");
    }
}

public class downcatingIntro {
    public static void main(String[] args) {
        Birds b = new Birds();
        if (b instanceof Sparrow){
            Sparrow s = (Sparrow) b;
            s.Food();
        }
        else {
            System.out.println("Downcasting is not possible");
        }
    }
}