package com.Constructor;

 class parent {
    parent(){

        System.out.println("No arg");
    }
    parent(int a, String s){

        System.out.println("2 arg");
    }
}
public class mixparent extends parent{
     mixparent(){
         super(23, "Swati");
         System.out.println("no arg child mixparent");
     }
     mixparent(String s,Boolean b){
         System.out.println("2 arg child mixparent");
     }
     public static void main (String[] args){
         mixparent mp = new mixparent();
         mixparent mp1 = new mixparent("java", Boolean.TRUE);
     }
}
