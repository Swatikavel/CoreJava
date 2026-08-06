package abstractioninoops;

 class account {
     private String accountholder;
     private double balance;

     public String getAccountholder() {
         return accountholder;
     }

     public void setAccountholder(String accountholder) {
         this.accountholder = accountholder;
     }

     public double getBalance() {
         return balance;
     }

     public void setBalance(double balance) {
         this.balance = balance;
     }

     public void Deposite(double amount) {
         balance = balance+amount;
         System.out.println("You have deposited"+amount+" rs and now balance is "+balance+"rs.");
     }
      public void withdrawn(double amount){
            balance = balance - amount;
          System.out.println("You have withdrwan"+amount+" rs and now balance is "+balance+"rs.");
     }
 }
public class Bankapp {
    public static void main(String[] args) {
        account Account = new account();

        Account.setAccountholder("Ram");
        Account.setBalance(100000);
        Account.withdrawn(5000);
    }
}

// This is Encapsulation Example