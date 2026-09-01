package com.Constructor;

  class Demo {
     String name;
     int age;
     Demo(String name , int age){
         this.name = name;
         this.age =age;
         System.out.println(name);
         System.out.println(age);
     }
     void display(String name, int age){
         System.out.println("Name:" +name);
         System.out.println("Age:" +age);
     }

 }
public class Constructor_DM{
  public static void main (String[] args){
      Demo dm = new Demo("Swati",22);
      dm.display("Rahul", 34);
  }
}
