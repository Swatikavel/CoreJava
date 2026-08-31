package basic_java;

public class Sessionbase {// class
    String name = "Swati"; // Instance variable // java gives default value
    int rollno = 19; // Instance variable // java give default value
    static String cname = "Swaraj"; // Static variable

void show(){
    // user define method
    //predefined method java already provided us
    int classroomno=101; // local variable must initialize value
    System.out.println("Class room number:"+ classroomno);
    System.out.println("Name of Student:" + name);
    System.out.println("roll no:" + rollno);
   System.out.println("Collage name:" +cname);
}


    public static void main (String[] args){ // main method
    Sessionbase sb = new Sessionbase(); // Create abject
 sb.show(); //call method
}
}

