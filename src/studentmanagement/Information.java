package studentmanagement;

 class StudentDetails {
     private int ID;
     private String name;
     private String course;
     private double marks;
     private int age;

     StudentDetails(int ID, String name, String course, double marks, int age) {
         this.ID = ID;
         this.name = name;
         this.course = course;
         this.marks = marks;
         this.age = age;
     }

     public int getID() {
         return ID;
     }

     public String getName() {
         return name;
     }

     public String getCourse() {
         return course;
     }

     public double getMarks() {
         return marks;
     }

     public int getAge() {
         return age;
     }

     public void setId() {
         this.ID = ID;
     }

     public void setName() {
         this.name = name;
     }

     public void setCourse() {
         this.course = course;
     }

     public void setMarks() {
         this.marks = marks;
     }

     public void setAge() {
         this.age = age;
     }

     public void details() {
         System.out.println("Student ID:" + ID);
         System.out.println("Student Name:" + name);
         System.out.println("Student CourseName:" + course);
         System.out.println("Student Marks:" + marks);
         System.out.println("Student Age:" + age);
     }
 }
    public class Information{
        public static void main (String[] args){
            StudentDetails sd1 = new StudentDetails(10432,"Sairam","BBACA",60.90,28);
            sd1.details();
        }
  }


