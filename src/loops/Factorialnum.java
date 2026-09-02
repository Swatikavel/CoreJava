package loops;

public class Factorialnum {
    public static void main (String[] args){
        int fact =1;
        for (int i=1; i<=5; i++){
            fact *=i;
        }
        System.out.println("Factorial Number:" + fact);
    }
}
 // Factorial number
//5! = 5*4*3*2*1
//==120
