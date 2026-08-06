package com.java;

public class SchoolForm {

    private int date;
    private String name;
    private int Marks;

    public int getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    public static void main(String[] args){
        SchoolForm rj= new SchoolForm();
        rj.setMarks(50);


    }
}



