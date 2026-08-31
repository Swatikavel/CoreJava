package inheritance;

 interface Grandparent {
     void Rights();

}
interface parent {
     void Legacy();
}

class child implements Grandparent,parent{
     public  void Rights() {
         System.out.println("Grandparent Rights for the decision making");
     }
     public void Legacy() {
         System.out.println("Parent is under Grandparent class");
     }
     public void Generation(){
         System.out.println("last generation of this family");


     }
}
public class InterfacesIntro{
     public static void main (String[] args){
child c = new child();
c.Rights();
c.Generation();
c.Legacy();

     }
}