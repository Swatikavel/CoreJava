package loops;

public class PrimeNum {
    public static void main(String[] args) {
        int i, Count = 0;
        for (i = 2; i <=10; i++) {
            if (10 % 2== 0) {
                Count++;
                break;
            }
        }
        if (Count == 0) {
            System.out.println("This is Prime number");
        } else {
            System.out.println("This is not Prime number");
        }
    }
}

