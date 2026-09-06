package introstatic;

import javax.lang.model.util.SimpleElementVisitor6;
import java.util.SimpleTimeZone;

class ExampleStatic {  //  Crate Class
     int age;
     String name;
     static String Countryname = "India";
     ExampleStatic(int age, String name, String Countryname) { // Create Constructor using class name
         this.age = age;
         this.name = name;
         this.Countryname =Countryname;
     }
 void display(){ // Create method to get statement
    System.out.println("Age: " + age);
     System.out.println("Name: " +name);
     System.out.println("Country Name: " +Countryname);
}
    public static void main(String[] args) {
        ExampleStatic es = new ExampleStatic(25, "Ram", "India"); // Create class object and initialize value
        es.display(); // Call Method
    }

    }
