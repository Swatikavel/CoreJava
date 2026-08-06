package inheritance;


   class GrandParent{
       void gp(){
           System.out.println("Method of GrandParent Class");
       }

   }

   class Parent extends GrandParent {
       void P() {
           System.out.println("Method of Parent Class");
       }
   }
   class Child extends Parent{
       void C() {
           System.out.println("Method of Child Class");
       }
   }

   class GrandChild extends Child{
       void gc() {
           System.out.println("Method of GrandChild Class");
       }
   }
public class multilevel_Inheritance {
       public static void main (String[]args){
           Child child = new Child();
           child.C();

       }
}
