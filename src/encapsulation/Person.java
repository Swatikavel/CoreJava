package encapsulation;

 class View {
     private int ID;
     private String name;

     public void setName(String pname) {
         name = pname;
     }
public void setID(int pID){
         ID = pID;
}
     public String getname() {
         return name;
     }


     public int getID() {
         return ID;
     }
 }
public class Person {
       public static void main (String[] args){
           View v = new View();
           v.setName("Ram");
           v.setID(101);
           System.out.println(v.getname());
           System.out.println(v.getID());
       }
}



