package Conditional_Statement;
// Plan Decided are going for trek
// Choose bike A
// Bike Drive
// Petrol will paid by other
// Bike drive B
// Petrol 50-50 paid
// No Trekking due to XYZ Reason

public class if_else_if_Solving {
        public static void main(String[] args) {
            String plan = "Trek with Bike A"; // Change this value to test different scenarios

            if (plan.equals("Trek with Bike A")) {
                System.out.println("Plan decided: Going for trek");
                System.out.println("Chosen Bike: A");
                System.out.println("Petrol will be paid by other person");
            } else if (plan.equals("Trek with Bike B")) {
                System.out.println("Plan decided: Going for trek");
                System.out.println("Chosen Bike: B");
                System.out.println("Petrol will be paid 50-50");
            } else if (plan.equals("No Trekking")) {
                System.out.println("No Trekking due to XYZ Reason");
            } else {
                System.out.println("Invalid plan selection");
            }
        }
    }
