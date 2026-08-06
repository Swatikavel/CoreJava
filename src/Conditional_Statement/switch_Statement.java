package Conditional_Statement;

public class switch_Statement {
    public static void main(String[]args){
        // Variable to be tested
        int dayNumber=2;
        String DayName= "Tuesday";

        switch (5){
            case 1:
                DayName="Monday";
                break;
            case 2:
                DayName="Tuesday";
                break;
            case 3:
                DayName ="Wednesday";
                break;
            case 4:
                 DayName="Thursday";
                 break;
            case 5:
                DayName="Friday";
                break;
            case 6:
                DayName="Saturday";
                break;
            case 7:
                DayName="Sunday";
                break;



        }
        // Display the output
        System.out.println("Day" + dayNumber + "is" + DayName);


    }
}
