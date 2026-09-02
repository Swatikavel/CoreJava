package loops;

public class NegativeFactNum {
    public static void main (String[] args){
        for (int i =-10;i<= Math.abs(-10);i++){
            if (i==0){
                continue;
            }
            else {
                if(-10%i==0){
                    System.out.println(i);
                }
            }
        }
    }
}
