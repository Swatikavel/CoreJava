package abstractioninoops;

interface Movietickatebooking {
    static String name = "City Pride";
    static final int a=20;
    public double d = 500.00;
   abstract void display();
}
interface Movies {
    abstract void options();
}
interface Slot {
   abstract void Timings();
}
class payment implements Movietickatebooking, Movies, Slot {
    public void display() {
        System.out.println("First page Display the picture");
    }

    public void options() {
        System.out.println("Display the Movie select options");
    }

    public void Timings() {
        System.out.println("Select the Slot of Movie");
    }
}

 class Moviessyatem{
     public static void main(String[] args) {
        payment pt = new payment();
        pt.display();
        pt.options();
        pt.Timings();
         System.out.println(Movietickatebooking.name);
         System.out.println(Movietickatebooking.a);
         System.out.println(Movietickatebooking.d);
        }
    }

