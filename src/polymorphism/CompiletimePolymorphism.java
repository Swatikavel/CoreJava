package polymorphism;

 class test {
    int add(int a, int b){
return a+b;
    }
    int add(int a, int b,int c){
        return a+b+c;
    }
}
class CompiletimePolymorphism {
    public static void main(String[] args) {
        test cp = new test();
        System.out.println(cp.add(100,300));
        System.out.println(cp.add(20,500,6000));
    }
}