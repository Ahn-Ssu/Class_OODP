
public class ATM_Accounts {

   public static void main (String[] args) {

      Savings_Account savings = new Savings_Account (4321, 531);

      ATM west_branch = new ATM (savings);
      ATM east_branch = new ATM (savings);

      west_branch.start();
      east_branch.start();

   }

}


class Savings_Account {

   protected int account;
   protected int balance;


   public Savings_Account (int account_num, int initial) {
      account = account_num;
      balance = initial;
   }

   public synchronized boolean withdrawal (int amount) {

      boolean result = false;
      System.out.println ("Withdrawal from account " + account);
      System.out.println ("Amount: " + amount);

      if (amount <= balance) {
         balance -= amount;
         System.out.println ("New balance: " + balance);
         result = true;
      } else
         System.out.println ("Insufficient funds.");

      System.out.println();

      return result;

   }

}


class ATM extends Thread {

   Savings_Account account;

   public ATM (Savings_Account savings) {
      account = savings;
   }


   public void run () {
      account.withdrawal (300);
   }  // method run

}  // class ATM
