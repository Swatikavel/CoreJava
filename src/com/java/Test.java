package com.java;


enum Month {
    January, February, March, April, May, June, July, August
}
enum Day{
    Sunday , Monday ,Tuesday
}
public class Test {
     public static void main(String[] args){
         Month today = Month.February;
         Day todays = Day.Monday;
         System.out.println("Current Month is:" +today);
         System.out.println("Today is:" +todays);
     }
}
