package com.java;

public class Messages {
    void display() {
        System.out.println("Hii, How are you");
    }


  }

    class Show {
        static void Test() {

            System.out.println("I' am Fine");
        }
        public static void main(String[] args) {
            Messages obj = new Messages(); // create class object
            obj.display();
            Show demo = new Show();
            demo.Test();

        }

    }
