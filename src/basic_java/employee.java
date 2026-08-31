package basic_java;

 interface employee {
    abstract void address();
}
interface location extends employee{
     abstract void location();
}
 interface pincode extends location{
     static void pincode( ){
         System.out.println("pincode:" +423517);
     }
}
class HR implements employee,location,pincode{
    public   void address(){
   System.out.println("Hitech City");
  }
  public  void location(){
      System.out.println("Hyderabad");
  }
  // void pincode(){
    //  System.out.println(411042);
  //} we cannot override static method
}
 class main {
  public static void main (String[] args){
   HR ab = new HR();
   ab.address();
   ab.location();
   pincode.pincode();
  }
}
