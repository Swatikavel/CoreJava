package com.Constructor;


 class Constructoruse {
     String name ;
     int age;
     Constructoruse(){
        name = "LG";
         age = 45;
     }
     public static void main (String[] args){
         Constructoruse cu = new Constructoruse();
         System.out.println("Name:" + cu.name);
         System.out.println("age:" + cu.age);
     }
}
