package Conditional_Statement;

public class Nested_forloop {
    public static void main (String[] args){
        // outer for loop.
        for (int i=1; i<=3; i++){
            System.out.print(i+"\n");  // it will execute 3 times.
            // inner for loop.
            for(int j=1; j<=4; j++){
                System.out.print(j+" "); // It will execute 12 (3*4) times.

            }
            System.out.println();
        }
    }
}

//  a for loop inside another for loop is called a nested for loop.