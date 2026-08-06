package Conditional_Statement;

public class do_While {
    public static void main (String[] args) {
        int i;
        i=0; // Starting number is 1
        // Execute the loop at least once and print the value of x.
        do {
            System.out.println(i); // Print x Value.
            i++;  // Increment x value by 1.
        }
        while (i==0); //This Statement will execute as long as x< =6.
    }
}

// It is similar to the while loop, except that the do-while loop executes the loop body first and then evaluates the loop continuation condition.