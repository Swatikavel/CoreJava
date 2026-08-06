package com.Constructor;

class car {
   String brand;
   int year;
   //1. No-arg Constructor
    public car(){
        this.brand = "Unknown";
        this. year =2026;
    }
    //2. Parameterized Constructor
    public car(String brand, int year) {
        this.brand = brand; // 'this' differentiates instance variable from parameter
        this.year=year;
    }
    // Method to display car data
    public void displayInfo(){
        System.out.println("Brand:"+ brand+", Year:"+ year);
    }
}

      public class Main {
    public static void main(String[]args){
        // calls the no- arg Constructor
        car car1=new car();
        // Calls the Parameterized Constructor
        car car2= new car("Toyota", 2023);
        // Display the Values
        car1.displayInfo(); // Output: Brand: Unknown, Year: 2026
        car2.displayInfo(); // Output: Brand: Toyota, Year: 2023

    }

}