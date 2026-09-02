package loops;

public class ContinueStatement {
    public static void main (String[] args){
        for (int j=0; j<=20; j++){
            if(j==14){
                continue;
            }
            System.out.println(j);
        }
    }
}
