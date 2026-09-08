package encapsulation;

 class Use {          // Create Class
     private int Emp_ID;       // Declare Instance Variable
     private String Departmentname; // Declare Instance Variable

     public int getEmp_Id() {      // Use Getter method with return type
         return Emp_ID;
     }

     public void setEmp_ID(int Emp_ID) {    // Use Setter method with void, using this keyword assign variable
         this.Emp_ID= Emp_ID;
     }

     public String getDepartmentname() { // Use Getter method with return type
         return Departmentname;
     }

     public void setDepartmentname(String Departmentname) {
         this.Departmentname = Departmentname;  // Use Setter method with void, using this keyword assign variable

     }
 }
    public class HowToUse{ // Create class
        public static void main (String[] args){ // Main method
            Use us = new Use(); // Create object
            us.setEmp_ID(101); // set values using object ref
            us.setDepartmentname("Dell"); // set values using object ref
            System.out.println("Employee ID:" +us.getEmp_Id()); // Print Statement using object ref call getter method
            System.out.println("Employee Department:" +us.getDepartmentname()); // Print Statement using object ref call getter method
        }
    }

