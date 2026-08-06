package basic_java;

public class FirstJavaProgram {
    void m1() {
        System.out.print("Hello World");
    }
    int m2(){
        System.out.println("Nikita");
        return 12;
    }
    public static void main(String[] args) {
        FirstJavaProgram fj = new FirstJavaProgram();
        fj.m1();
        System.out.println();
        fj.m2();
    }
}
