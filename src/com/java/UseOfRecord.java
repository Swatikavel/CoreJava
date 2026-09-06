package com.java;

record Details(String name , int id) {

}
record Rules(boolean f,char c){

}
public class UseOfRecord{
    public static void main (String[] args){
        Details d = new Details("Ram", 411054);
        Rules r = new Rules(false,'R');
        System.out.println("Age 15 Eligible:"+ r.f());
        System.out.println("First Letter of name:" +r.c());
        System.out.println("Student Name:" +d.name());
        System.out.println("Student ID:" +d.id());
    }
}