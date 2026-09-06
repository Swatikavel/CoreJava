package basic_java;

 class car {
     public car(String Brand, int Year) {
     }

     public class main {
         public static void Main(String[] args) {
             // calls the no- arg Constructor
             car car1 = new car("Brand",2026);
             // Calls the Parameterized Constructor
             car car2 = new car("Toyota", 2026);
             // Display the Values
             System.out.println("Display car1 and car2 Information");

         }
     }
 }