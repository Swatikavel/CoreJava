package com.java;

public @interface MyCustomAnnotation {
        class H {
            void Display() {
                System.out.println("Hii");
            }
            public static void main(String[] args){
                MyCustomAnnotation. H obj =new  MyCustomAnnotation.H();
                obj.Display();
            }
        }



}
