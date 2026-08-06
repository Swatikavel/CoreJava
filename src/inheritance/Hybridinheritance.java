package inheritance;

     class Employee{
        void Work(){
            System.out.println("Method of Employee Working");
        }
    }

     class Sports extends Employee{
        void Football(){
            System.out.println("Method of Playing sports Football");
        }
    }

     class Software{
      void Design(){
          System.out.println("Method of Software Design");
      }
    }

    public class Hybridinheritance{
        public static void main (String[] args){
            // Create an Object of the Hybrid class
            Employee MyEmployee = new Employee();

        }

    }

