package Conditional_Statement;
// Marks < 35               -> Fail
// Marks >= 35 && Marks< 60      -> Second Class
// Marks >= 60 && Marks< 75      -> First Class
// Marks >= 75 && Marks< 75      -> First Class with Distinction
// Marks >= 90                   -> Merit
//please enter correct marks
public class ifElseif_Statement {
    public static void main (String[]args){
        int marks =35;
        if (marks < 35){
            System.out.println("marks get result fail");
    }else if (marks >=35 && marks <60){
                System.out.println("marks get result Pass class second");
        }else if (marks >= 60 && marks <75){
            System.out.println("marks get result Pass class First");
        }else if (marks >=60 && marks<75){
            System.out.println("marks get result Pass  First class with distinction");
        }else if (marks >=90){
            System.out.println("marks get result merit marks");
        }else {
            System.out.println("Please provide correct marks");
        }
}
}
