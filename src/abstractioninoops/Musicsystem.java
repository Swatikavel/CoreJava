package abstractioninoops;

  abstract class Audio {
    double price;
    String brandname;
    static String type = "Hobby";

    Audio(){
        double price = 2500;
        String brandname = "LG";
       // String type = "Hobby"; // we can call directly static variables.
        System.out.println(price);
        System.out.println(brandname);
       // System.out.println(type);
    }
       abstract void sound ();

       static void song () {
            System.out.println("Play music");
        }
}
 abstract class Display extends Audio {
    Display(){
        super();
    }
     final void picture(){
         System.out.println("Display picture");
     }
 }
class video extends Display{
    video(){
        super();
    }
  final void sound(){
        System.out.println("sound with extra volume");
    }

    public static void main (String[] args){
        video vi = new video();
        vi.sound();
        vi.picture();
        System.out.println(Audio.type); // This is the best way of call static variable
        Audio.song();
    }

}


